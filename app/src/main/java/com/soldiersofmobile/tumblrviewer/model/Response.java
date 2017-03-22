
package com.soldiersofmobile.tumblrviewer.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("blog")
    @Expose
    private Blog blog;
    @SerializedName("posts")
    @Expose
    private List<Post> posts = null;
    @SerializedName("total_posts")
    @Expose
    private Long totalPosts;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Long getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(Long totalPosts) {
        this.totalPosts = totalPosts;
    }

}
