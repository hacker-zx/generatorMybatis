package com.zx.model;

public class Comment {
    private Integer commentId;

    private Integer productId;

    private Integer userId;

    private String comment;

    private Byte start;

    public Comment(Integer commentId, Integer productId, Integer userId, String comment, Byte start) {
        this.commentId = commentId;
        this.productId = productId;
        this.userId = userId;
        this.comment = comment;
        this.start = start;
    }

    public Comment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Byte getStart() {
        return start;
    }

    public void setStart(Byte start) {
        this.start = start;
    }
}