
package com.musyqa.android.fragments;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.AutoCompleteTextView;

import com.jayway.android.robotium.solo.Solo;
import com.musyqa.android.R;
import com.musyqa.android.activities.TestCaseFragmentActivity;

public class SearchMixesFragmentTest
        extends ActivityInstrumentationTestCase2<TestCaseFragmentActivity> {

    private Solo solo;

    private SearchMixesFragment fragment;

    /**
     * Instantiates a new search mixes fragment test.
     */
    public SearchMixesFragmentTest() {
        super(TestCaseFragmentActivity.class);
    }

    /*
     * (non-Javadoc)
     * @see android.test.AndroidTestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());

        getActivity().getFragmentManager()
                .beginTransaction()
                .add(new SearchMixesFragment(), "test")
                .commit();

        solo.waitForFragmentByTag("test");

        fragment = (SearchMixesFragment) getActivity().getFragmentManager().findFragmentByTag("test");

        assertNotNull(fragment);
        assertNotNull(fragment.getView());
    }

    /**
     * Test should inflate layout to view.
     */
    public void testSingleLetterShouldNotInvokeSearch() {
        AutoCompleteTextView searchView =
                (AutoCompleteTextView) fragment.getView().findViewById(R.id.fsl_textview_search);

        assertEquals(0, searchView.getAdapter().getCount());
        solo.enterText(searchView, "e");
        assertEquals(0, searchView.getAdapter().getCount());
    }
}
