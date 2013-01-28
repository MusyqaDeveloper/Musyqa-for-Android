
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * The Class Mix.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mix extends BaseEntity {

    /** The cover urls. */
    @JsonProperty(value = "cover_urls")
    private CoverUrls coverUrls;

    /** The description. */
    private String description;

    /** The first published at. */
    @JsonProperty(value = "first_published_at")
    private Date firstPublishedAt;

    /** The liked by current user. */
    @JsonProperty(value = "liked_by_current_user")
    private boolean likedByCurrentUser;

    /** The likes count. */
    @JsonProperty(value = "likes_count")
    private int likesCount;

    /** The name. */
    private String name;

    /** The nsfw. */
    private boolean nsfw;

    /** The path. */
    private String path;

    /** The plays count. */
    @JsonProperty(value = "plays_count")
    private int playsCount;

    /** The published. */
    private boolean published;

    /** The slug. */
    private String slug;

    /** The tag list cache. */
    @JsonProperty(value = "tag_list_cache")
    private String tagListCache;

    /** The user. */
    private User user;

    /**
     * Gets the cover urls.
     * 
     * @return the cover urls
     */
    public CoverUrls getCoverUrls() {
        return coverUrls;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the first published at.
     * 
     * @return the first published at
     */
    public Date getFirstPublishedAt() {
        return firstPublishedAt;
    }

    /**
     * Gets the likes count.
     * 
     * @return the likes count
     */
    public int getLikesCount() {
        return likesCount;
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
     * Gets the path.
     * 
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Gets the plays count.
     * 
     * @return the plays count
     */
    public int getPlaysCount() {
        return playsCount;
    }

    /**
     * Gets the slug.
     * 
     * @return the slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Gets the tag list cache.
     * 
     * @return the tag list cache
     */
    public String getTagListCache() {
        return tagListCache;
    }

    /**
     * Gets the user.
     * 
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Checks if is liked by current user.
     * 
     * @return true, if is liked by current user
     */
    public boolean isLikedByCurrentUser() {
        return likedByCurrentUser;
    }

    /**
     * Checks if is nsfw.
     * 
     * @return true, if is nsfw
     */
    public boolean isNsfw() {
        return nsfw;
    }

    /**
     * Checks if is published.
     * 
     * @return true, if is published
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Sets the cover urls.
     * 
     * @param coverUrls the new cover urls
     */
    public void setCoverUrls(CoverUrls coverUrls) {
        this.coverUrls = coverUrls;
    }

    /**
     * Sets the description.
     * 
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the first published at.
     * 
     * @param firstPublishedAt the new first published at
     */
    public void setFirstPublishedAt(Date firstPublishedAt) {
        this.firstPublishedAt = firstPublishedAt;
    }

    /**
     * Sets the liked by current user.
     * 
     * @param likedByCurrentUser the new liked by current user
     */
    public void setLikedByCurrentUser(boolean likedByCurrentUser) {
        this.likedByCurrentUser = likedByCurrentUser;
    }

    /**
     * Sets the likes count.
     * 
     * @param likesCount the new likes count
     */
    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
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
     * Sets the nsfw.
     * 
     * @param nsfw the new nsfw
     */
    public void setNsfw(boolean nsfw) {
        this.nsfw = nsfw;
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
     * Sets the plays count.
     * 
     * @param playsCount the new plays count
     */
    public void setPlaysCount(int playsCount) {
        this.playsCount = playsCount;
    }

    /**
     * Sets the published.
     * 
     * @param published the new published
     */
    public void setPublished(boolean published) {
        this.published = published;
    }

    /**
     * Sets the slug.
     * 
     * @param slug the new slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Sets the tag list cache.
     * 
     * @param tagListCache the new tag list cache
     */
    public void setTagListCache(String tagListCache) {
        this.tagListCache = tagListCache;
    }

    /**
     * Sets the user.
     * 
     * @param user the new user
     */
    public void setUser(User user) {
        this.user = user;
    }
}
