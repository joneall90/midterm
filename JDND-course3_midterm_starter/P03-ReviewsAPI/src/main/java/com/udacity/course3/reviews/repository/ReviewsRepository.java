package com.udacity.course3.reviews.repository;

import com.udacity.course3.reviews.entities.Product;
import com.udacity.course3.reviews.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewsRepository extends JpaRepository<Review, Integer> {
    List<Review> findAllByProduct(Product product);
}
