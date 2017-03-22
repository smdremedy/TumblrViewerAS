
package com.soldiersofmobile.tumblrviewer.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("alt_sizes")
    @Expose
    private List<AltSize> altSizes = null;
    @SerializedName("original_size")
    @Expose
    private OriginalSize originalSize;
    @SerializedName("exif")
    @Expose
    private Exif exif;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<AltSize> getAltSizes() {
        return altSizes;
    }

    public void setAltSizes(List<AltSize> altSizes) {
        this.altSizes = altSizes;
    }

    public OriginalSize getOriginalSize() {
        return originalSize;
    }

    public void setOriginalSize(OriginalSize originalSize) {
        this.originalSize = originalSize;
    }

    public Exif getExif() {
        return exif;
    }

    public void setExif(Exif exif) {
        this.exif = exif;
    }

}
