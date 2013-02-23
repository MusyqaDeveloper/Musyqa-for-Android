
package com.musyqa.android.eighttracks;

import java.io.IOException;

/**
 * The Interface EightTracksApi.
 */
public interface EightTracksApi {

    /**
     * Gets the mix set.
     * 
     * @return the mix set
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MixSet getMixSet() throws IOException;

    /**
     * Gets the mix set.
     * 
     * @param perPage the per page
     * @param page the page
     * @return the mix set
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MixSet getMixSet(int perPage, int page) throws IOException;

    /**
     * Gets the tags.
     * 
     * @return the tags
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public Tags getTags() throws IOException;

    /**
     * Search tags.
     * 
     * @param q the q
     * @return the tags
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public Tags searchTags(String q, int perPage, int page) throws IOException;
}
