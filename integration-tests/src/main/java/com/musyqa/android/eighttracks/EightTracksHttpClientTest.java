
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
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void testGetMixesShouldReturn12Mixes() throws IOException {
        EightTracksHttpClient httpClient = new EightTracksHttpClient();
        MixSet mixSet = httpClient.getMixSet();

        assertNotNull(mixSet);
        assertNotNull(mixSet.getMixes());
        assertEquals(12, mixSet.getMixes().size());
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

        assertNotNull(mixSet);
        assertNotNull(mixSet.getMixes());
        assertEquals("mixes size should be " + perPage, perPage, mixSet.getMixes().size());
        assertEquals("mixset page should be " + pageNumber, pageNumber, mixSet.getPage());
    }

    /**
     * Test get tags should return26 tags.
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void testGetTagsShouldReturn26Tags() throws IOException {
        EightTracksHttpClient httpClient = new EightTracksHttpClient();

        Tags tags = httpClient.getTags();

        assertNotNull(tags);
        assertNotNull(tags.getTags());
        assertEquals(26, tags.getTags().size());
    }

    /**
     * Test search tags should return tags results.
     * 
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void testSearchTagsShouldReturnTagsResults() throws IOException {
        EightTracksHttpClient httpClient = new EightTracksHttpClient();
        Tags tags;

        tags = httpClient.searchTags("lo", 10, 0);
        assertNotNull(tags);
        assertNotNull(tags.getTags());
        assertEquals(10, tags.getTags().size());

        tags = httpClient.searchTags("l", 10, 0);
        assertNotNull(tags);
        assertNotNull(tags.getTags());
        assertTrue(tags.getTags().size() == 0);
    }
}
