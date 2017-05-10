package me.zero.client.api.gui.tab;

import me.zero.client.api.gui.IRenderer;
import me.zero.client.api.util.interfaces.Loadable;

/**
 * Base for Tab Gui Handlers
 *
 * @see me.zero.client.api.gui.tab.ITabGuiElement
 *
 * @since 1.0
 *
 * @author Brady
 * @since 1/20/2017 12:00PM
 */
public interface ITabGui extends Loadable, IRenderer {

    /**
     * @since 1.0
     *
     * @return The main menu of this Tab GUI
     */
    ITabGuiMenu getMenu();
}
