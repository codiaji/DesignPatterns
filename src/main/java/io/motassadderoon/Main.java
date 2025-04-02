package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Creating many trees with the same attributes (high memory usage)
        forest.plantTree("Oak", "Green", "Rough", 1, 2);
        forest.plantTree("Oak", "Green", "Rough", 3, 5);
        forest.plantTree("Pine", "Dark Green", "Smooth", 4, 6);
        forest.plantTree("Oak", "Green", "Rough", 7, 8);
        forest.plantTree("Pine", "Dark Green", "Smooth", 9, 10);

        // Rendering all trees
        forest.render();
    }
}
