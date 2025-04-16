package io.motassadderoon;

public class ImageViewer {
    public void showImage(String filename) {
        Loadable image = new ImageProxy(filename);
        image.display();
    }
}