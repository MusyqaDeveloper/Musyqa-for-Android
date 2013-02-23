
package com.musyqa.android.logs;

import android.util.Log;

/**
 * The Class LogcatLogger.
 */
public class LogcatLogger implements ILogger {

    /** The tag. */
    private final String tag;

    /**
     * Instantiates a new logcat logger.
     * 
     * @param tag the tag
     */
    public LogcatLogger(String tag) {
        this.tag = tag;
    }

    /*
     * (non-Javadoc)
     * @see com.musyqa.android.logs.ILogger#d(java.lang.String)
     */
    @Override
    public void d(String msg) {
        Log.d(tag, msg);
    }

    /*
     * (non-Javadoc)
     * @see com.musyqa.android.logs.ILogger#d(java.lang.String,
     * java.lang.Object[])
     */
    @Override
    public void d(String msg, Object... args) {
        Log.d(tag, String.format(msg, args));
    }

    @Override
    public void v(String msg) {
       Log.v(tag, msg);
    }

    @Override
    public void v(String msg, Object... args) {
        Log.v(tag, String.format(msg, args));
    }

}
