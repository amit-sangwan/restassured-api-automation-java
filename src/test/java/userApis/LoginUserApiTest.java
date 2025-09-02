package userApis;

import base.BaseTest;
import models.gson.LoginUserPojo;
import org.testng.annotations.Test;

public class LoginUserApiTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginUserPojo loginUser = new LoginUserPojo();
        loginUser.setEmail("admin@juice-sh.op");
        loginUser.setPassword("admin123");

        String token = apiClient.login(loginUser);
    }

}