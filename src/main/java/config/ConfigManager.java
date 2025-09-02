package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static Properties properties = new Properties();
    private static String env;

    static {
        try {
            // Get environment from system property injected by Maven
            env = System.getProperty("env", "local"); // default local if not set

            InputStream input = ConfigManager.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(input);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties");
        }
    }


    // Generic getter
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    // Get base URL for current environment
    public static String getBaseUrl() {
        return getProperty("base.url." + env);
    }

    // Get auth token for current environment
    public static String getAuthToken() {
        return getProperty("auth.token." + env);
    }

    // Example: connect timeout
    public static int getConnectTimeout() {
        return Integer.parseInt(getProperty("connect.timeout"));
    }

    public static int getReadTimeout() {
        return Integer.parseInt(getProperty("read.timeout"));
    }
}
