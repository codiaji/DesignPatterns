package io.motassadderoon;

public class AppConfig {
    private final String serverUrl;
    private final int timeout;
    private final boolean debugMode;

    public AppConfig() {
        // Load configuration from file
        this.serverUrl = "https://api.example.com";
        this.timeout = 30;
        this.debugMode = true;
        System.out.println("Configuration loaded");
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
