
package com.soldiersofmobile.tumblrviewer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reblog {

    @SerializedName("tree_html")
    @Expose
    private String treeHtml;
    @SerializedName("comment")
    @Expose
    private String comment;

    public String getTreeHtml() {
        return treeHtml;
    }

    public void setTreeHtml(String treeHtml) {
        this.treeHtml = treeHtml;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
