
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Tag.
 */
public class Tag {

    /** The cool taggings count. */
    @JsonProperty(value = "cool_taggings_count")
    private String coolTaggingsCount;

    /** The name. */
    private String name;

    /**
     * Gets the cool taggings count.
     * 
     * @return the cool taggings count
     */
    public String getCoolTaggingsCount() {
        return coolTaggingsCount;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the cool taggings count.
     * 
     * @param coolTaggingsCount the new cool taggings count
     */
    public void setCoolTaggingsCount(String coolTaggingsCount) {
        this.coolTaggingsCount = coolTaggingsCount;
    }

    /**
     * Sets the name.
     * 
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
}
