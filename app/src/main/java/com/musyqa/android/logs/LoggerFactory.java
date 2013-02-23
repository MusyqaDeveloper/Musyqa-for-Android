
package com.musyqa.android.logs;

public class LoggerFactory {

    /**
     * Gets the logger.
     * 
     * @param clazz the clazz
     * @return the logger
     */
    public static ILogger getLogger(Class<?> clazz) {
        return new LogcatLogger(clazz.getSimpleName());
    }
}
