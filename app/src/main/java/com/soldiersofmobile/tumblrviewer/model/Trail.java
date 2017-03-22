
package com.soldiersofmobile.tumblrviewer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trail {

    @SerializedName("blog")
    @Expose
    private Blog_ blog;
    @SerializedName("post")
    @Expose
    private Post_ post;
    @SerializedName("content_raw")
    @Expose
    private String contentRaw;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("is_current_item")
    @Expose
    private Boolean isCurrentItem;
    @SerializedName("is_root_item")
    @Expose
    private Boolean isRootItem;

    public Blog_ getBlog() {
        return blog;
    }

    public void setBlog(Blog_ blog) {
        this.blog = blog;
    }

    public Post_ getPost() {
        return post;
    }

    public void setPost(Post_ post) {
        this.post = post;
    }

    public String getContentRaw() {
        return contentRaw;
    }

    public void setContentRaw(String contentRaw) {
        this.contentRaw = contentRaw;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsCurrentItem() {
        return isCurrentItem;
    }

    public void setIsCurrentItem(Boolean isCurrentItem) {
        this.isCurrentItem = isCurrentItem;
    }

    public Boolean getIsRootItem() {
        return isRootItem;
    }

    public void setIsRootItem(Boolean isRootItem) {
        this.isRootItem = isRootItem;
    }

}
