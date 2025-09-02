// OrderPojo.java
package models.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdersPojo {

    @JsonProperty("UserId")
    private Integer userId;

    @JsonProperty("BasketId")
    private Integer basketId;

    @JsonProperty("DeliveryMethod")
    private String deliveryMethod;

    @JsonProperty("PaymentMethod")
    private String paymentMethod;

    // Getters and Setters
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBasketId() {
        return basketId;
    }

    public void setBasketId(Integer basketId) {
        this.basketId = basketId;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
