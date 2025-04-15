package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        UIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            factory = new WindowsUIFactory();
        } else if (osName.contains("mac")) {
            factory = new MacUIFactory();
        } else {
            factory = new LinuxUIFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}