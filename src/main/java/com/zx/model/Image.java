package com.zx.model;

public class Image {
    private Integer imageId;

    private Integer productId;

    private String source;

    public Image(Integer imageId, Integer productId, String source) {
        this.imageId = imageId;
        this.productId = productId;
        this.source = source;
    }

    public Image() {
        super();
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}