package io.motassadderoon;

public class ImageProxy implements Loadable {
    private final String filename;
    private Loadable realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}