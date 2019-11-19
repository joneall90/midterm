package com.udacity.course3.reviews.entities;


import javax.persistence.*;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @ManyToOne
    private String productId;

    private String review;

    @OneToMany (mappedBy = "comment")
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void Review(){}
}