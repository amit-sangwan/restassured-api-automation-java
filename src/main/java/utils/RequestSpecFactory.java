package specs;

import config.ConfigManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

/*
 * DRY principle: “Don’t Repeat Yourself” aimed at improving maintainability, readability, and scalability of code.
 * */
public class RequestSpecFactory {
    // Basic request spec without authentication
    public static RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigManager.get("baseUrl"))
                .setContentType(ContentType.JSON)
                .build();
    }

    // Request spec with Bearer token authentication
    public static RequestSpecification getAuthenticatedRequestSpec(String token) {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigManager.get("baseUrl"))
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer " + token)
                .build();
    }
}
