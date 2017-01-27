package me.zero.client.api.util.logger;

/**
 * Base for Loggers
 *
 * @see me.zero.client.api.util.logger.Logger
 *
 * @since 1.0
 *
 * Created by Brady on 1/21/2017.
 */
public interface ILogger {

    /**
     * Logs a message with a level
     *
     * @since 1.0
     *
     * @param level The level
     * @param message The message
     */
    void log(Level level, String message);

    /**
     * Logs a formatted message with a level
     *
     * @since 1.0
     *
     * @param level The level
     * @param message The message
     * @param args The format arguments
     */
    void logf(Level level, String message, Object... args);
}