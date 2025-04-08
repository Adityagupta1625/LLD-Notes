package ReviewSystem.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ReviewSystem.DAO.ProductDAO;
import ReviewSystem.Model.Product;
import ReviewSystem.Model.Review;

public class ProductService {

    private Map<Integer, Product> products;
    private ReviewService reviewService;

    public ProductService(Map<Integer, Product> products, ReviewService reviewService) {
        this.products = products;
        this.reviewService = reviewService;
    }

    public void addProduct(ProductDAO productDAO) {
        Product product = new Product();
        product.setName(productDAO.getName());
        product.setProductId(productDAO.getProductId());
        product.setPrice(productDAO.getPrice());
        products.put(product.getProductId(), product);
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

    public void removeProduct(int productId) {
        products.remove(productId);
    }

    public int averageRatingByProductId(int productId) {
        List<Review> reviews = reviewService.getReviewsByProductId(productId);

        int totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.getRating();
        }
        return Math.round((float) totalRating * 1.0f / reviews.size());
    }

    public List<Review> sortReviewsByStarRatings(int productId) {
        List<Review> reviews = reviewService.getReviewsByProductId(productId);

        reviews.sort((Review r1, Review r2) -> r2.getRating() - r1.getRating());
        return reviews;
    }

    public List<Product> sortProductByRatings(int productId) {
        List<Product> productList = new ArrayList<Product>();

        for (Product product : products.values()) {
            productList.add(product);
        }

        productList.sort((Product p1, Product p2) -> averageRatingByProductId(p2.getProductId())
                - averageRatingByProductId(p1.getProductId()));

        return productList;
    }

    public List<Product> sortProductByLatestReview(int productId) {
        List<Product> productList = new ArrayList<Product>();
        Map<Long, Product> productVsReviewTime = new HashMap<Long, Product>();

        for (Product product : products.values()) {
            List<Review> reviews = reviewService.getReviewsByProductId(product.getProductId());

            reviews.sort((Review r1, Review r2) -> r2.getTimestamp().compareTo(r1.getTimestamp()));

            productVsReviewTime.put(reviews.get(0).getTimestamp(), product);
        }

    }
}
