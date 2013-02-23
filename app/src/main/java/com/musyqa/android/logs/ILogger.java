
package com.musyqa.android.logs;

/**
 * The Interface ILogger.
 */
public interface ILogger {

    void d(String msg);

    void d(String msg, Object... args);

    void v(String msg);

    void v(String msg, Object... args);
}
