
package com.soldiersofmobile.tumblrviewer.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("blog_name")
    @Expose
    private String blogName;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("post_url")
    @Expose
    private String postUrl;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("reblog_key")
    @Expose
    private String reblogKey;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("recommended_source")
    @Expose
    private Object recommendedSource;
    @SerializedName("recommended_color")
    @Expose
    private Object recommendedColor;
    @SerializedName("post_author")
    @Expose
    private String postAuthor;
    @SerializedName("note_count")
    @Expose
    private Long noteCount;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("reblog")
    @Expose
    private Reblog reblog;
    @SerializedName("trail")
    @Expose
    private List<Trail> trail = null;
    @SerializedName("link_url")
    @Expose
    private String linkUrl;
    @SerializedName("image_permalink")
    @Expose
    private String imagePermalink;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("can_like")
    @Expose
    private Boolean canLike;
    @SerializedName("can_reblog")
    @Expose
    private Boolean canReblog;
    @SerializedName("can_send_in_message")
    @Expose
    private Boolean canSendInMessage;
    @SerializedName("can_reply")
    @Expose
    private Boolean canReply;
    @SerializedName("display_avatar")
    @Expose
    private Boolean displayAvatar;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getReblogKey() {
        return reblogKey;
    }

    public void setReblogKey(String reblogKey) {
        this.reblogKey = reblogKey;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Object getRecommendedSource() {
        return recommendedSource;
    }

    public void setRecommendedSource(Object recommendedSource) {
        this.recommendedSource = recommendedSource;
    }

    public Object getRecommendedColor() {
        return recommendedColor;
    }

    public void setRecommendedColor(Object recommendedColor) {
        this.recommendedColor = recommendedColor;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public Long getNoteCount() {
        return noteCount;
    }

    public void setNoteCount(Long noteCount) {
        this.noteCount = noteCount;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Reblog getReblog() {
        return reblog;
    }

    public void setReblog(Reblog reblog) {
        this.reblog = reblog;
    }

    public List<Trail> getTrail() {
        return trail;
    }

    public void setTrail(List<Trail> trail) {
        this.trail = trail;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImagePermalink() {
        return imagePermalink;
    }

    public void setImagePermalink(String imagePermalink) {
        this.imagePermalink = imagePermalink;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(Boolean canLike) {
        this.canLike = canLike;
    }

    public Boolean getCanReblog() {
        return canReblog;
    }

    public void setCanReblog(Boolean canReblog) {
        this.canReblog = canReblog;
    }

    public Boolean getCanSendInMessage() {
        return canSendInMessage;
    }

    public void setCanSendInMessage(Boolean canSendInMessage) {
        this.canSendInMessage = canSendInMessage;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public Boolean getDisplayAvatar() {
        return displayAvatar;
    }

    public void setDisplayAvatar(Boolean displayAvatar) {
        this.displayAvatar = displayAvatar;
    }

}
