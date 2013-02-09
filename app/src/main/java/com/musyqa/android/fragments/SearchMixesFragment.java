
package com.musyqa.android.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import com.musyqa.android.R;

/**
 * User: roisagiv Date: 29/1/13 Time: 10:12 PM.
 */
public class SearchMixesFragment extends Fragment {

    /** The Search view. */
    private AutoCompleteTextView mSearchView;

    /** The Search results list adapter. */
    private SearchResultsListAdapter mSearchResultsListAdapter;

    /*
     * (non-Javadoc)
     * @see android.app.Fragment#onCreateView(android.view.LayoutInflater,
     * android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search_mixes, container);
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
    }

    /**
     * The Class SearchResultsListAdapter.
     */
    private static class SearchResultsListAdapter
            extends BaseAdapter
            implements Filterable {

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

        @Override
        public Filter getFilter() {
            return null;
        }
    }
}
