
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CoverUrls.
 */
public class CoverUrls {
    // ------------------------------ FIELDS ------------------------------

    /** The cropped imgix url. */
    @JsonProperty(value = "cropped_imgix_url")
    private String croppedImgixUrl;

    /** The max1024. */
    private String max1024;

    /** The max133w. */
    private String max133w;

    /** The max200. */
    private String max200;

    /** The original. */
    private String original;

    /** The original imgix url. */
    @JsonProperty(value = "original_imgix_url")
    private String originalImgixUrl;

    /** The original url. */
    @JsonProperty(value = "original_url")
    private String originalUrl;

    /** The sq100. */
    private String sq100;

    /** The sq133. */
    private String sq133;

    /** The sq250. */
    private String sq250;

    /** The sq500. */
    private String sq500;

    /** The sq56. */
    private String sq56;

    /** The use original on mixpage. */
    @JsonProperty(value = "use_original_on_mixpage")
    private boolean useOriginalOnMixpage;

    /**
     * Gets the cropped imgix url.
     * 
     * @return the cropped imgix url
     */
    public String getCroppedImgixUrl() {
        return croppedImgixUrl;
    }

    /**
     * Gets the max1024.
     * 
     * @return the max1024
     */
    public String getMax1024() {
        return this.max1024;
    }

    /**
     * Gets the max133w.
     * 
     * @return the max133w
     */
    public String getMax133w() {
        return this.max133w;
    }

    /**
     * Gets the max200.
     * 
     * @return the max200
     */
    public String getMax200() {
        return this.max200;
    }

    /**
     * Gets the original.
     * 
     * @return the original
     */
    public String getOriginal() {
        return this.original;
    }

    /**
     * Gets the original imgix url.
     * 
     * @return the original imgix url
     */
    public String getOriginalImgixUrl() {
        return originalImgixUrl;
    }

    /**
     * Gets the original url.
     * 
     * @return the original url
     */
    public String getOriginalUrl() {
        return originalUrl;
    }

    /**
     * Gets the sq100.
     * 
     * @return the sq100
     */
    public String getSq100() {
        return this.sq100;
    }

    // -------------------------- OTHER METHODS --------------------------

    /**
     * Gets the sq133.
     * 
     * @return the sq133
     */
    public String getSq133() {
        return this.sq133;
    }

    /**
     * Gets the sq250.
     * 
     * @return the sq250
     */
    public String getSq250() {
        return this.sq250;
    }

    /**
     * Gets the sq500.
     * 
     * @return the sq500
     */
    public String getSq500() {
        return this.sq500;
    }

    /**
     * Gets the sq56.
     * 
     * @return the sq56
     */
    public String getSq56() {
        return this.sq56;
    }

    /**
     * Checks if is use original on mixpage.
     * 
     * @return true, if is use original on mixpage
     */
    public boolean isUseOriginalOnMixpage() {
        return useOriginalOnMixpage;
    }

    /**
     * Sets the cropped imgix url.
     * 
     * @param croppedImgixUrl the new cropped imgix url
     */
    public void setCroppedImgixUrl(String croppedImgixUrl) {
        this.croppedImgixUrl = croppedImgixUrl;
    }

    /**
     * Sets the max1024.
     * 
     * @param max1024 the new max1024
     */
    public void setMax1024(String max1024) {
        this.max1024 = max1024;
    }

    /**
     * Sets the max133w.
     * 
     * @param max133w the new max133w
     */
    public void setMax133w(String max133w) {
        this.max133w = max133w;
    }

    /**
     * Sets the max200.
     * 
     * @param max200 the new max200
     */
    public void setMax200(String max200) {
        this.max200 = max200;
    }

    /**
     * Sets the original.
     * 
     * @param original the new original
     */
    public void setOriginal(String original) {
        this.original = original;
    }

    /**
     * Sets the original imgix url.
     * 
     * @param originalImgixUrl the new original imgix url
     */
    public void setOriginalImgixUrl(String originalImgixUrl) {
        this.originalImgixUrl = originalImgixUrl;
    }

    /**
     * Sets the original url.
     * 
     * @param originalUrl the new original url
     */
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    /**
     * Sets the sq100.
     * 
     * @param sq100 the new sq100
     */
    public void setSq100(String sq100) {
        this.sq100 = sq100;
    }

    /**
     * Sets the sq133.
     * 
     * @param sq133 the new sq133
     */
    public void setSq133(String sq133) {
        this.sq133 = sq133;
    }

    /**
     * Sets the sq250.
     * 
     * @param sq250 the new sq250
     */
    public void setSq250(String sq250) {
        this.sq250 = sq250;
    }

    /**
     * Sets the sq500.
     * 
     * @param sq500 the new sq500
     */
    public void setSq500(String sq500) {
        this.sq500 = sq500;
    }

    /**
     * Sets the sq56.
     * 
     * @param sq56 the new sq56
     */
    public void setSq56(String sq56) {
        this.sq56 = sq56;
    }

    /**
     * Sets the use original on mixpage.
     * 
     * @param useOriginalOnMixpage the new use original on mixpage
     */
    public void setUseOriginalOnMixpage(boolean useOriginalOnMixpage) {
        this.useOriginalOnMixpage = useOriginalOnMixpage;
    }
}
