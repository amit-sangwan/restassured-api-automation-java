package models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BasketItemPojo {

    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("BasketId")
    @Expose
    private Integer basketId;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBasketId() {
        return basketId;
    }

    public void setBasketId(Integer basketId) {
        this.basketId = basketId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}