package clients;

import io.restassured.response.Response;
import models.gson.LoginUserPojo;
import utils.RequestSpecFactory;

import static io.restassured.RestAssured.given;

public class CustomJuiceShopApiClient {

    private String token;

    public CustomJuiceShopApiClient() {
    }

    public CustomJuiceShopApiClient(String token) {
        this.token = token;
    }

    // AUTHENTICATION

    public String login(LoginUserPojo loginPayload) {

        Response response = given(RequestSpecFactory.getRequestSpec())
                .body(loginPayload)
                .when()
                .post("/rest/user/login");

        response.then().statusCode(200);
        return response.toString();
        //   LoginResponse loginResponse = response.as(LoginResponse.class);
        //   this.token = loginResponse.getAuthentication().getToken();
        //   return this.token;
    }

    // PRODUCTS

    public Response getAllProducts() {
        return given(RequestSpecFactory.getRequestSpec())
                .when()
                .get("/api/Products");
    }

}
