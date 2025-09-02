package baseSetup;

import apiLayer.CustomJuiceShopApiClient;
import config.ConfigManager;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    protected static CustomJuiceShopApiClient apiClient = new CustomJuiceShopApiClient();

    @BeforeSuite
    public void beforeSuite() {
        Reporter.log("****************************************************", true);
        Reporter.log("Test Suite Initialized", true);
        Reporter.log("Environment picked from POM/profile: " + System.getProperty("env", "local"), true);
        Reporter.log("Base URL: " + ConfigManager.getBaseUrl(), true);
        Reporter.log("Auth Token: " + ConfigManager.getAuthToken(), true);
        Reporter.log("Connect Timeout: " + ConfigManager.getConnectTimeout(), true);
        Reporter.log("Read Timeout: " + ConfigManager.getReadTimeout(), true);
        Reporter.log("****************************************************", true);
        Reporter.log("****** Tests on Prod may take time , machines takes time to start if went to sleep ******", true);
        Reporter.log("****************************************************", true);

    }

    @BeforeMethod
    public void beforemethod(ITestResult result) {
        Reporter.log(">>>>>  Test Running: " + result.getMethod().getMethodName(), true);
    }


}
