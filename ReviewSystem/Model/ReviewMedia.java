package ReviewSystem.Model;

public class ReviewMedia {
    private int reviewId;
    private String mediaUrl;

    public ReviewMedia(int reviewId, String mediaUrl) {
        this.reviewId = reviewId;
        this.mediaUrl = mediaUrl;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
}
