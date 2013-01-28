
package com.musyqa.android.eighttracks;

import android.test.AndroidTestCase;

/**
 * The Class EightTracksHttpClientTest.
 */
public class EightTracksHttpClientTest extends AndroidTestCase {

    /**
     * Test get mixes should return 12 mixes.
     */
    public void testGetMixesShouldReturn12Mixes() {
        EightTracksHttpClient httpClient = new EightTracksHttpClient();
        MixSet mixSet = httpClient.getMixSet();

        assertNotNull("mixSet should not be null", mixSet);
        assertNotNull("mixes collection should not be null", mixSet.getMixes());
        assertEquals("mixes size should be 12", 12, mixSet.getMixes().size());
    }
}
