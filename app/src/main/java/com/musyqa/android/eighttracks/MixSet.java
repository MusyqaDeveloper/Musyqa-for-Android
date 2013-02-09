
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The Class MixSet.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MixSet extends Response {
    // ------------------------------ FIELDS ------------------------------

    /** The id. */
    private long id;

    /** The mixes. */
    private List<Mix> mixes;

    /** The name. */
    private String name;

    /** The page. */
    private int page;

    /** The path. */
    private String path;

    /** The per page. */
    @JsonProperty(value = "per_page")
    private int perPage;

    /** The total entries. */
    @JsonProperty(value = "total_entries")
    private int totalEntries;

    /** The total pages. */
    @JsonProperty(value = "total_pages")
    private int totalPages;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Gets the mixes.
     * 
     * @return the mixes
     */
    public List<Mix> getMixes() {
        return mixes;
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
     * Gets the page.
     * 
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * Gets the path.
     * 
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Gets the per page.
     * 
     * @return the per page
     */
    public int getPerPage() {
        return perPage;
    }

    /**
     * Gets the total entries.
     * 
     * @return the total entries
     */
    public int getTotalEntries() {
        return totalEntries;
    }

    /**
     * Gets the total pages.
     * 
     * @return the total pages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the id.
     * 
     * @param id the new id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the mixes.
     * 
     * @param mixes the new mixes
     */
    public void setMixes(List<Mix> mixes) {
        this.mixes = mixes;
    }

    /**
     * Sets the name.
     * 
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the page.
     * 
     * @param page the new page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Sets the path.
     * 
     * @param path the new path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Sets the per page.
     * 
     * @param perPage the new per page
     */
    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    /**
     * Sets the total entries.
     * 
     * @param totalEntries the new total entries
     */
    public void setTotalEntries(int totalEntries) {
        this.totalEntries = totalEntries;
    }

    /**
     * Sets the total pages.
     * 
     * @param totalPages the new total pages
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
