
package com.musyqa.android.fragments;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.AutoCompleteTextView;

import com.jayway.android.robotium.solo.Solo;
import com.musyqa.android.R;
import com.musyqa.android.activities.TestCaseFragmentActivity;
import com.musyqa.android.eighttracks.Tags;
import com.musyqa.android.testability.DependencyInjector;

import java.io.IOException;

public class SearchMixesFragmentTest
        extends ActivityInstrumentationTestCase2<TestCaseFragmentActivity> {

    private SearchMixesFragment fragment;

    private Solo solo;

    /**
     * Instantiates a new search mixes fragment test.
     */
    public SearchMixesFragmentTest() {
        super(TestCaseFragmentActivity.class);
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

    /**
     * Test two or more letters should invoke search.
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void testTwoOrMoreLettersShouldInvokeSearch() throws IOException {
        String searchTerm = "lo";

        Tags tags = DependencyInjector.getEightTracksApi().searchTags(searchTerm, 10, 0);

        AutoCompleteTextView searchView =
                (AutoCompleteTextView) fragment.getView().findViewById(R.id.fsl_textview_search);

        assertEquals(0, searchView.getAdapter().getCount());

        // act
        solo.enterText(searchView, searchTerm);

        // wait
        solo.waitForText(tags.getTags().get(0).getName());
        
        // assert
        assertEquals(tags.getTags().size(), searchView.getAdapter().getCount());
    }

    /*
     * (non-Javadoc)
     * @see android.test.AndroidTestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());

        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .add(new SearchMixesFragment(), "test")
                .commit();

        solo.waitForFragmentByTag("test");

        fragment = (SearchMixesFragment) getActivity().getSupportFragmentManager()
                .findFragmentByTag("test");

        assertNotNull(fragment);
        assertNotNull(fragment.getView());
    }

    /*
     * (non-Javadoc)
     * @see android.test.ActivityInstrumentationTestCase2#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }
}
