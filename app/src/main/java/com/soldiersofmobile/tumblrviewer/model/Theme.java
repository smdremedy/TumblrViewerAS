
package com.soldiersofmobile.tumblrviewer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Theme {

    @SerializedName("header_full_width")
    @Expose
    private Long headerFullWidth;
    @SerializedName("header_full_height")
    @Expose
    private Long headerFullHeight;
    @SerializedName("header_focus_width")
    @Expose
    private Long headerFocusWidth;
    @SerializedName("header_focus_height")
    @Expose
    private Long headerFocusHeight;
    @SerializedName("avatar_shape")
    @Expose
    private String avatarShape;
    @SerializedName("background_color")
    @Expose
    private String backgroundColor;
    @SerializedName("body_font")
    @Expose
    private String bodyFont;
    @SerializedName("header_bounds")
    @Expose
    private String headerBounds;
    @SerializedName("header_image")
    @Expose
    private String headerImage;
    @SerializedName("header_image_focused")
    @Expose
    private String headerImageFocused;
    @SerializedName("header_image_scaled")
    @Expose
    private String headerImageScaled;
    @SerializedName("header_stretch")
    @Expose
    private Boolean headerStretch;
    @SerializedName("link_color")
    @Expose
    private String linkColor;
    @SerializedName("show_avatar")
    @Expose
    private Boolean showAvatar;
    @SerializedName("show_description")
    @Expose
    private Boolean showDescription;
    @SerializedName("show_header_image")
    @Expose
    private Boolean showHeaderImage;
    @SerializedName("show_title")
    @Expose
    private Boolean showTitle;
    @SerializedName("title_color")
    @Expose
    private String titleColor;
    @SerializedName("title_font")
    @Expose
    private String titleFont;
    @SerializedName("title_font_weight")
    @Expose
    private String titleFontWeight;

    public Long getHeaderFullWidth() {
        return headerFullWidth;
    }

    public void setHeaderFullWidth(Long headerFullWidth) {
        this.headerFullWidth = headerFullWidth;
    }

    public Long getHeaderFullHeight() {
        return headerFullHeight;
    }

    public void setHeaderFullHeight(Long headerFullHeight) {
        this.headerFullHeight = headerFullHeight;
    }

    public Long getHeaderFocusWidth() {
        return headerFocusWidth;
    }

    public void setHeaderFocusWidth(Long headerFocusWidth) {
        this.headerFocusWidth = headerFocusWidth;
    }

    public Long getHeaderFocusHeight() {
        return headerFocusHeight;
    }

    public void setHeaderFocusHeight(Long headerFocusHeight) {
        this.headerFocusHeight = headerFocusHeight;
    }

    public String getAvatarShape() {
        return avatarShape;
    }

    public void setAvatarShape(String avatarShape) {
        this.avatarShape = avatarShape;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBodyFont() {
        return bodyFont;
    }

    public void setBodyFont(String bodyFont) {
        this.bodyFont = bodyFont;
    }

    public String getHeaderBounds() {
        return headerBounds;
    }

    public void setHeaderBounds(String headerBounds) {
        this.headerBounds = headerBounds;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getHeaderImageFocused() {
        return headerImageFocused;
    }

    public void setHeaderImageFocused(String headerImageFocused) {
        this.headerImageFocused = headerImageFocused;
    }

    public String getHeaderImageScaled() {
        return headerImageScaled;
    }

    public void setHeaderImageScaled(String headerImageScaled) {
        this.headerImageScaled = headerImageScaled;
    }

    public Boolean getHeaderStretch() {
        return headerStretch;
    }

    public void setHeaderStretch(Boolean headerStretch) {
        this.headerStretch = headerStretch;
    }

    public String getLinkColor() {
        return linkColor;
    }

    public void setLinkColor(String linkColor) {
        this.linkColor = linkColor;
    }

    public Boolean getShowAvatar() {
        return showAvatar;
    }

    public void setShowAvatar(Boolean showAvatar) {
        this.showAvatar = showAvatar;
    }

    public Boolean getShowDescription() {
        return showDescription;
    }

    public void setShowDescription(Boolean showDescription) {
        this.showDescription = showDescription;
    }

    public Boolean getShowHeaderImage() {
        return showHeaderImage;
    }

    public void setShowHeaderImage(Boolean showHeaderImage) {
        this.showHeaderImage = showHeaderImage;
    }

    public Boolean getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(Boolean showTitle) {
        this.showTitle = showTitle;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getTitleFont() {
        return titleFont;
    }

    public void setTitleFont(String titleFont) {
        this.titleFont = titleFont;
    }

    public String getTitleFontWeight() {
        return titleFontWeight;
    }

    public void setTitleFontWeight(String titleFontWeight) {
        this.titleFontWeight = titleFontWeight;
    }

}
