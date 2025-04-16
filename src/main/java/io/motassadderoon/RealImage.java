package io.motassadderoon;

public class RealImage {
    private final String filename;

    public RealImage(String filename) {
        System.out.println("RealImage: Loading " + filename);
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("RealImage: Loaded " + filename);
    }

    public void display() {
        System.out.println("RealImage: Displaying " + filename);
    }
}