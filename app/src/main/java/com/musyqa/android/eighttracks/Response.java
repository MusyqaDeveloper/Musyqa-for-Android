
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    /** The api version. */
    @JsonProperty(value = "api_version")
    private int apiVersion;

    /** The api warning. */
    @JsonProperty(value = "api_warning")
    private String[] apiWarning;

    /** The canonical path. */
    @JsonProperty(value = "canonical_path")
    private String canonicalPath;

    /** The errors. */
    private String errors;

    /** The logged in. */
    @JsonProperty(value = "logged_in")
    private boolean loggedIn;

    /** The next page. */
    @JsonProperty(value = "next_page")
    private int nextPage;

    /** The previous page. */
    @JsonProperty(value = "previous_page")
    private String previousPage;

    /** The status. */
    private String status;

    /**
     * Gets the api version.
     * 
     * @return the api version
     */
    public int getApiVersion() {
        return apiVersion;
    }

    /**
     * Gets the api warning.
     * 
     * @return the api warning
     */
    public String[] getApiWarning() {
        return apiWarning;
    }

    /**
     * Gets the canonical path.
     * 
     * @return the canonical path
     */
    public String getCanonicalPath() {
        return canonicalPath;
    }

    /**
     * Gets the errors.
     * 
     * @return the errors
     */
    public String getErrors() {
        return errors;
    }

    /**
     * Gets the next page.
     * 
     * @return the next page
     */
    public int getNextPage() {
        return nextPage;
    }

    /**
     * Gets the previous page.
     * 
     * @return the previous page
     */
    public String getPreviousPage() {
        return previousPage;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Checks if is logged in.
     * 
     * @return true, if is logged in
     */
    public boolean isLoggedIn() {
        return loggedIn;
    }

    /**
     * Sets the api version.
     * 
     * @param apiVersion the new api version
     */
    public void setApiVersion(int apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Sets the api warning.
     * 
     * @param apiWarning the new api warning
     */
    public void setApiWarning(String[] apiWarning) {
        this.apiWarning = apiWarning;
    }

    /**
     * Sets the canonical path.
     * 
     * @param canonicalPath the new canonical path
     */
    public void setCanonicalPath(String canonicalPath) {
        this.canonicalPath = canonicalPath;
    }

    /**
     * Sets the errors.
     * 
     * @param errors the new errors
     */
    public void setErrors(String errors) {
        this.errors = errors;
    }

    /**
     * Sets the logged in.
     * 
     * @param loggedIn the new logged in
     */
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * Sets the next page.
     * 
     * @param nextPage the new next page
     */
    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    /**
     * Sets the previous page.
     * 
     * @param previousPage the new previous page
     */
    public void setPreviousPage(String previousPage) {
        this.previousPage = previousPage;
    }

    /**
     * Sets the status.
     * 
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
