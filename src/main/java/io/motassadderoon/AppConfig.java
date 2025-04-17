package io.motassadderoon;



public class AppConfig {
    private final String serverUrl;
    private final int timeout;
    private final boolean debugMode;

    private static AppConfig instance;

    private AppConfig() {
        // Load configuration from file
            this.serverUrl = "https://api.example.com";
            this.timeout = 30;
            this.debugMode = true;
            System.out.println("Configuration loaded");
    }

    public static AppConfig getInstance() {
        if (instance == null) { // First check (no synchronization)
            synchronized (AppConfig.class) {
                if (instance == null) { // Second check (with synchronization)
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }
    public String getServerUrl() {
        return serverUrl;
    }

    public int getTimeout() {
        return timeout;
    }

    public boolean isDebugMode() {
        return debugMode;
    }
}
