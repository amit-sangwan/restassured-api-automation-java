package models.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListProductPojo {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("price")
    @Expose
    private Double price;

    // getters and setters
}
