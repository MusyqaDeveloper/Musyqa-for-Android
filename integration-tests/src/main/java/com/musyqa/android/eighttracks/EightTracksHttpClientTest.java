
package com.musyqa.android.eighttracks;

import android.test.AndroidTestCase;

import java.io.IOException;

/**
 * The Class EightTracksHttpClientTest.
 */
public class EightTracksHttpClientTest extends AndroidTestCase {

    /**
     * Test get mixes should return 12 mixes.
     * 
     * @throws IOException
     */
    public void testGetMixesShouldReturn12Mixes() throws IOException {
        EightTracksHttpClient httpClient = new EightTracksHttpClient();
        MixSet mixSet = httpClient.getMixSet();

        assertNotNull("mixSet should not be null", mixSet);
        assertNotNull("mixes collection should not be null", mixSet.getMixes());
        assertEquals("mixes size should be 12", 12, mixSet.getMixes().size());
    }

    /**
     * Test get mixses with paging return requests mixes.
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void testGetMixsesWithPagingReturnRequestsMixes() throws IOException {
        int perPage = 25;
        int pageNumber = 3;

        EightTracksHttpClient httpClient = new EightTracksHttpClient();
        MixSet mixSet = httpClient.getMixSet(perPage, pageNumber);

        assertNotNull("mixSet should not be null", mixSet);
        assertNotNull("mixes collection should not be null", mixSet.getMixes());
        assertEquals("mixes size should be " + perPage, perPage, mixSet.getMixes().size());
        assertEquals("mixset page should be " + pageNumber, pageNumber, mixSet.getPage());
    }
}
