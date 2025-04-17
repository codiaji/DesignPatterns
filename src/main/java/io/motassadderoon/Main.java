package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getSingleton();
        AppConfig config2 = AppConfig.getSingleton();

        System.out.println(config1 == config2);
    }
}