
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MixSet extends Response {
    // ------------------------------ FIELDS ------------------------------

    private long id;

    private List<Mix> mixes;

    private String name;

    @JsonProperty(value = "next_page")
    private int nextPage;

    private int page;

    private String path;

    @JsonProperty(value = "per_page")
    private int perPage;

    @JsonProperty(value = "previous_page")
    private String previousPage;

    @JsonProperty(value = "total_entries")
    private int totalEntries;

    @JsonProperty(value = "total_pages")
    private int totalPages;

    public long getId() {
        return id;
    }

    public List<Mix> getMixes() {
        return mixes;
    }

    public String getName() {
        return name;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getPage() {
        return page;
    }

    public String getPath() {
        return path;
    }

    public int getPerPage() {
        return perPage;
    }

    public String getPreviousPage() {
        return previousPage;
    }

    public int getTotalEntries() {
        return totalEntries;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMixes(List<Mix> mixes) {
        this.mixes = mixes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public void setPreviousPage(String previousPage) {
        this.previousPage = previousPage;
    }

    public void setTotalEntries(int totalEntries) {
        this.totalEntries = totalEntries;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
