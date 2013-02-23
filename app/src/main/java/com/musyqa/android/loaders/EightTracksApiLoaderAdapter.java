
package com.musyqa.android.loaders;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;

import com.musyqa.android.eighttracks.EightTracksApi;
import com.musyqa.android.eighttracks.Tags;

import java.io.IOException;

/**
 * The Class EightTracksApiLoaderAdapter.
 */
public class EightTracksApiLoaderAdapter {

    /** The Eight tracks api. */
    private final EightTracksApi mEightTracksApi;

    /**
     * Instantiates a new eight tracks api loader adapter.
     * 
     * @param eightTracksApi the eight tracks api
     */
    public EightTracksApiLoaderAdapter(EightTracksApi eightTracksApi) {
        mEightTracksApi = eightTracksApi;
    }

    /**
     * Search tags.
     * 
     * @param context the context
     * @return the loader
     */
    public Loader<Tags> searchTags(Context context, final String q, final int perPage, final int page) {
        return new BugFixedAsyncLoader<Tags>(context) {

            /*
             * (non-Javadoc)
             * @see
             * android.support.v4.content.AsyncTaskLoader#loadInBackground()
             */
            @Override
            public Tags loadInBackground() {
                try {
                    return mEightTracksApi.searchTags(q, perPage, page);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };
    }

    /**
     * This class intent to fix a bug
     * [http://code.google.com/p/android/issues/detail?id=14944] <b>source from
     * here
     * [http://code.google.com/p/android/issues/attachmentText?id=14944&aid=
     * 3979053000479899300
     * &name=BugFixedAsyncLoader.java&token=c47_td7qVNHwwaE2EqnVdhTlO_8
     * %3A1350479700636]
     * 
     * @param <D> the generic type
     */
    private static abstract class BugFixedAsyncLoader<D> extends AsyncTaskLoader<D> {

        // ------------------------------ FIELDS ------------------------------

        /**
         * The Data.
         */
        private D data;

        // --------------------------- CONSTRUCTORS ---------------------------

        /**
         * Instantiates a new Bug fixed async loader.
         * 
         * @param context the context
         */
        public BugFixedAsyncLoader(Context context) {
            super(context);
        }

        // -------------------------- OTHER METHODS --------------------------

        // -------------------------- PUBLIC METHODS --------------------------
        /*
         * (non-Javadoc)
         * @see
         * android.support.v4.content.Loader#deliverResult(java.lang.Object)
         */
        @Override
        public void deliverResult(D data) {
            if (isReset()) {
                // An async query came in while the loader is stopped
                return;
            }

            this.data = data;

            super.deliverResult(data);
        }

        // -------------------------- PROTECTED METHODS
        // --------------------------

        /*
         * (non-Javadoc)
         * @see android.support.v4.content.Loader#onReset()
         */
        @Override
        protected void onReset() {
            super.onReset();

            // Ensure the loader is stopped
            onStopLoading();

            data = null;
        }

        /*
         * (non-Javadoc)
         * @see android.support.v4.content.Loader#onStartLoading()
         */
        @Override
        protected void onStartLoading() {
            if (data != null) {
                deliverResult(data);
            }

            if (takeContentChanged() || data == null) {
                forceLoad();
            }
        }

        /*
         * (non-Javadoc)
         * @see android.support.v4.content.Loader#onStopLoading()
         */
        @Override
        protected void onStopLoading() {
            // Attempt to cancel the current load task if possible.
            cancelLoad();
        }
    }
}
