package com.udacity.course3.reviews;

import com.udacity.course3.reviews.entities.Product;
import com.udacity.course3.reviews.entities.Review;
import com.udacity.course3.reviews.repository.ReviewsRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReviewsApplicationTests {
	@Autowired
	ReviewsRepository reviewsRepository;
	@Test
	public void contextLoads() {
	}

	@Test
	public void reviewTest(){
		Review review = new Review();
		review.setReview("very good");
		Product product = new Product();
		product.setProductId(1);
		product.setProductName("dina");
		review.setProductId(product);
		System.out.println(review);
		review = reviewsRepository.save(review);
		Assert.assertNotNull("review is null", review);

	}
}