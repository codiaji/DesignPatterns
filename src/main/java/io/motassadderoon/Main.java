package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        AppConfig config1 = new AppConfig();
        AppConfig config2 = new AppConfig();

        System.out.println(config1 == config2); // false - different instances
    }
}