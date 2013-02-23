
package com.musyqa.android.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import com.musyqa.android.R;
import com.musyqa.android.eighttracks.Tag;
import com.musyqa.android.eighttracks.Tags;
import com.musyqa.android.loaders.EightTracksApiLoaderAdapter;
import com.musyqa.android.logs.ILogger;
import com.musyqa.android.logs.LoggerFactory;
import com.musyqa.android.testability.DependencyInjector;

import java.util.ArrayList;
import java.util.List;

/**
 * User: roisagiv Date: 29/1/13 Time: 10:12 PM.
 */
public class SearchMixesFragment extends Fragment implements TextWatcher {

    /** The Constant LOGGER. */
    private static final ILogger LOGGER = LoggerFactory.getLogger(SearchMixesFragment.class);

    /** The Search results list adapter. */
    private SearchResultsListAdapter mSearchResultsListAdapter;

    /** The Search view. */
    private AutoCompleteTextView mSearchView;

    /** The Loader adapter. */
    private EightTracksApiLoaderAdapter mLoaderAdapter;

    /*
     * (non-Javadoc)
     * @see android.text.TextWatcher#afterTextChanged(android.text.Editable)
     */
    @Override
    public void afterTextChanged(Editable s) {
        if (s.length() >= 2) {
            LOGGER.d("perform search for %s", s.toString());

            TagSearchLoaderCallbacks callbacks = new TagSearchLoaderCallbacks(
                    mLoaderAdapter, mSearchResultsListAdapter, getActivity(), s.toString()
                    );

            getLoaderManager().restartLoader(0, null, callbacks);
        }
    }

    /*
     * (non-Javadoc)
     * @see android.text.TextWatcher#beforeTextChanged(java.lang.CharSequence,
     * int, int, int)
     */
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    /*
     * (non-Javadoc)
     * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
     * android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LOGGER.v("onCreateView");
        return inflater.inflate(R.layout.fragment_search_mixes, container);
    }

    /*
     * (non-Javadoc)
     * @see android.text.TextWatcher#onTextChanged(java.lang.CharSequence, int,
     * int, int)
     */
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    /*
     * (non-Javadoc)
     * @see android.app.Fragment#onViewCreated(android.view.View,
     * android.os.Bundle)
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mSearchView = (AutoCompleteTextView) view.findViewById(R.id.fsl_textview_search);
        mSearchResultsListAdapter = new SearchResultsListAdapter();

        mSearchView.setAdapter(mSearchResultsListAdapter);
        mSearchView.addTextChangedListener(this);

        mLoaderAdapter = new EightTracksApiLoaderAdapter(
                DependencyInjector.getEightTracksApi()
                );
    }

    /**
     * The Class SearchResultsListAdapter.
     */
    private static class SearchResultsListAdapter
            extends BaseAdapter
            implements Filterable {

        /** The Tags. */
        private List<Tag> mTags = new ArrayList<Tag>();

        /*
         * (non-Javadoc)
         * @see android.widget.Adapter#getCount()
         */
        @Override
        public int getCount() {
            return 0;
        }

        /*
         * (non-Javadoc)
         * @see android.widget.Filterable#getFilter()
         */
        @Override
        public Filter getFilter() {
            return null;
        }

        /*
         * (non-Javadoc)
         * @see android.widget.Adapter#getItem(int)
         */
        @Override
        public Object getItem(int position) {
            return null;
        }

        /*
         * (non-Javadoc)
         * @see android.widget.Adapter#getItemId(int)
         */
        @Override
        public long getItemId(int position) {
            return 0;
        }

        /*
         * (non-Javadoc)
         * @see android.widget.Adapter#getView(int, android.view.View,
         * android.view.ViewGroup)
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }

        /**
         * Sets the tags.
         * 
         * @param tags the new tags
         */
        public void setTags(List<Tag> tags) {
            mTags.clear();
            mTags.addAll(tags);

            notifyDataSetChanged();
        }
    }

    /**
     * The Class TagSearchLoaderCallbacks.
     */
    private static class TagSearchLoaderCallbacks implements LoaderCallbacks<Tags> {

        /** The Context. */
        private Context mContext;

        /** The Loader adapter. */
        private EightTracksApiLoaderAdapter mLoaderAdapter;

        /** The Search results list adapter. */
        private SearchResultsListAdapter mSearchResultsListAdapter;

        /** The q. */
        private String q;

        /**
         * Instantiates a new tag search loader callbacks.
         * 
         * @param loaderAdapter the loader adapter
         * @param searchResultsListAdapter the search results list adapter
         * @param context the context
         * @param q the q
         */
        public TagSearchLoaderCallbacks(
                EightTracksApiLoaderAdapter loaderAdapter,
                SearchResultsListAdapter searchResultsListAdapter,
                Context context,
                String q) {

            mLoaderAdapter = loaderAdapter;
            mSearchResultsListAdapter = searchResultsListAdapter;
            mContext = context;
            this.q = q;
        }

        /*
         * (non-Javadoc)
         * @see
         * android.support.v4.app.LoaderManager.LoaderCallbacks#onCreateLoader
         * (int, android.os.Bundle)
         */
        @Override
        public Loader<Tags> onCreateLoader(int id, Bundle args) {
            LOGGER.d("create loader for %s", q);
            return mLoaderAdapter.searchTags(mContext, q, 10, 1);
        }

        /*
         * (non-Javadoc)
         * @see
         * android.support.v4.app.LoaderManager.LoaderCallbacks#onLoaderReset
         * (android.support.v4.content.Loader)
         */
        @Override
        public void onLoaderReset(Loader<Tags> loader) {

        }

        /*
         * (non-Javadoc)
         * @see
         * android.support.v4.app.LoaderManager.LoaderCallbacks#onLoadFinished
         * (android.support.v4.content.Loader, java.lang.Object)
         */
        @Override
        public void onLoadFinished(Loader<Tags> loader, Tags data) {
            LOGGER.d("onLoadFinished, data=%s", data);
            mSearchResultsListAdapter.setTags(data.getTags());
        }

    }
}
