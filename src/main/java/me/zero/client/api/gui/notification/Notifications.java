package me.zero.client.api.gui.notification;

import java.util.ArrayList;
import java.util.List;

/**
 * Essentially a Notification Manager, only takes in a renderer
 *
 * @since 1.0
 *
 * Created by Brady on 1/6/2017.
 */
public class Notifications {

	/**
	 * The list of notifications for this notification handler
	 */
	private List<INotification> notifications = new ArrayList<>();

	/**
	 * The renderer for this notification handler
	 */
	private final INotificationRenderer renderer;
	
	public Notifications(INotificationRenderer renderer) {
		this.renderer = renderer;
	}

	/**
	 * Creates a notification
	 *
	 * @since 1.0
	 *
	 * @param header The header text
	 * @param subtext The subtext
	 */
	public void post(String header, String subtext) {
		this.post(header, subtext, 2500);
	}

	/**
	 * Creates a notification
	 *
	 * @since 1.0
	 *
	 * @param header The header text
	 * @param subtext The subtext
	 * @param displayTime The display time
	 */
	public void post(String header, String subtext, long displayTime) {
		this.post(header, subtext, (long) (displayTime / 16F), displayTime);
	}

	/**
	 * Creates a notification
	 *
	 * @since 1.0
	 *
	 * @param header The header text
	 * @param subtext The subtext
	 * @param fade The fade time
	 * @param displayTime The display time
	 */
	public void post(String header, String subtext, long fade, long displayTime) {
		this.notifications.add(new Notification(header, subtext, fade, displayTime));
	}

	/**
	 * Renders the nofications
	 *
	 * @since 1.0
	 */
	public void render() {
		renderer.draw(notifications);
	}

	/**
	 * Various Notification Types
	 */
	public enum Type {
		URGENT, WARNING, INFO
	}
}