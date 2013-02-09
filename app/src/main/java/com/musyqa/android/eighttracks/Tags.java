
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * The Class Tags.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tags extends Response {

    /** The tags. */
    private List<Tag> tags;

    /**
     * Gets the tags.
     * 
     * @return the tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * Sets the tags.
     * 
     * @param tags the new tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
