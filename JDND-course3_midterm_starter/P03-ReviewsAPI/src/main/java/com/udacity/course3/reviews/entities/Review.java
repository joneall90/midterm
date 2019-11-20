package com.udacity.course3.reviews.entities;


import javax.persistence.*;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @ManyToOne
    private Product product;

    private String review;

    @OneToMany (mappedBy = "comment")
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Product getProductId() {
        return product;
    }

    public void setProductId(Product productId) {
        this.product = productId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void Review(){}
}