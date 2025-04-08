package ReviewSystem.DAO;

import java.util.List;

public class ReviewDAO {

    private int reviewId;
    private int userId;
    private int productId;
    private int rating;
    private String review;
    private int orderId;
    private List<String> mediaUrls;

    public ReviewDAO(int reviewId, int userId, int productId, int rating, String review, List<String> mediaUrls,
            int orderId) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.productId = productId;
        this.rating = rating;
        this.review = review;
        this.mediaUrls = mediaUrls;
        this.orderId = orderId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getMediaUrls() {
        return mediaUrls;
    }

    public void setMediaUrls(List<String> mediaUrls) {
        this.mediaUrls = mediaUrls;
    }
}
