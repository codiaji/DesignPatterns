package io.motassadderoon;

public class ImageViewer {
    public void showImage(String filename) {
        RealImage image = new RealImage(filename);
        image.display();
    }
}