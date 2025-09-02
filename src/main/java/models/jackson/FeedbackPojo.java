// FeedbackPojo.java
package models.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeedbackPojo {

    @JsonProperty("message")
    private String message;

    @JsonProperty("rating")
    private Integer rating;

    @JsonProperty("UserId")
    private Integer userId;

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
