
package com.soldiersofmobile.tumblrviewer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Blog_ {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("theme")
    @Expose
    private Theme theme;
    @SerializedName("share_likes")
    @Expose
    private Boolean shareLikes;
    @SerializedName("share_following")
    @Expose
    private Boolean shareFollowing;
    @SerializedName("can_be_followed")
    @Expose
    private Boolean canBeFollowed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Boolean getShareLikes() {
        return shareLikes;
    }

    public void setShareLikes(Boolean shareLikes) {
        this.shareLikes = shareLikes;
    }

    public Boolean getShareFollowing() {
        return shareFollowing;
    }

    public void setShareFollowing(Boolean shareFollowing) {
        this.shareFollowing = shareFollowing;
    }

    public Boolean getCanBeFollowed() {
        return canBeFollowed;
    }

    public void setCanBeFollowed(Boolean canBeFollowed) {
        this.canBeFollowed = canBeFollowed;
    }

}
