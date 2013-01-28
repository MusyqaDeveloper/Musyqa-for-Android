
package com.musyqa.android.eighttracks;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class User.
 */
public class User extends BaseEntity {

    /** The avatar urls. */
    @JsonProperty(value = "avatar_urls")
    private AvatarUrls avatarUrls;

    /** The followed by current user. */
    @JsonProperty(value = "followed_by_current_user")
    private boolean followedByCurrentUser;

    /** The login. */
    private String login;

    /** The slug. */
    private String slug;

    /**
     * Gets the avatar urls.
     * 
     * @return the avatar urls
     */
    public AvatarUrls getAvatarUrls() {
        return avatarUrls;
    }

    /**
     * Gets the login.
     * 
     * @return the login
     */
    public String getLogin() {
        return login;
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
     * Checks if is followed by current user.
     * 
     * @return true, if is followed by current user
     */
    public boolean isFollowedByCurrentUser() {
        return followedByCurrentUser;
    }

    /**
     * Sets the avatar urls.
     * 
     * @param avatarUrls the new avatar urls
     */
    public void setAvatarUrls(AvatarUrls avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    /**
     * Sets the followed by current user.
     * 
     * @param followedByCurrentUser the new followed by current user
     */
    public void setFollowedByCurrentUser(boolean followedByCurrentUser) {
        this.followedByCurrentUser = followedByCurrentUser;
    }

    /**
     * Sets the login.
     * 
     * @param login the new login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Sets the slug.
     * 
     * @param slug the new slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

}
