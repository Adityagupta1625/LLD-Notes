package ReviewSystem.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ReviewSystem.DAO.ReviewDAO;
import ReviewSystem.Model.Review;

public class ReviewService {

    private OrderService orderService;
    private Map<Integer, List<Review>> usersVsReviews;
    private Map<Integer, List<Review>> productsVsReviews;

    public ReviewService(OrderService orderService) {
        this.usersVsReviews = new HashMap<Integer, List<Review>>();
        this.productsVsReviews = new HashMap<Integer, List<Review>>();
        this.orderService = orderService;
    }

    public Boolean addReview(ReviewDAO reviewDAO) {
        int orderId = reviewDAO.getOrderId();

        if (orderService.canReview(orderId)) {
            Review review = new Review();
            review.setReviewId(reviewDAO.getReviewId());
            review.setUserId(reviewDAO.getUserId());
            review.setProductId(reviewDAO.getProductId());
            review.setRating(reviewDAO.getRating());
            review.setReview(reviewDAO.getReview());
            review.setTimestamp(System.currentTimeMillis());

            if (usersVsReviews.containsKey(review.getUserId())) {
                usersVsReviews.get(review.getUserId()).add(review);
            } else {
                List<Review> reviews = new ArrayList<Review>();
                reviews.add(review);
                usersVsReviews.put(review.getUserId(), reviews);
            }

            if (productsVsReviews.containsKey(review.getProductId())) {
                productsVsReviews.get(review.getProductId()).add(review);
            } else {
                List<Review> reviews = new ArrayList<Review>();
                reviews.add(review);
                productsVsReviews.put(review.getProductId(), reviews);
            }

            return true;
        }

        return false;
    }

    public List<Review> getReviewsByUserId(int userId) {
        return usersVsReviews.get(userId);
    }

    public List<Review> getReviewsByProductId(int productId) {
        return productsVsReviews.get(productId);
    }

}
