package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree("Oak", "Green", "Rough", 1, 2);
        forest.plantTree("Oak", "Green", "Rough", 3, 4);
        forest.plantTree("Pine", "Dark Green", "Smooth", 5, 6);
        forest.plantTree("Pine", "Dark Green", "Smooth", 7, 8);
        forest.plantTree("Oak", "Green", "Rough", 9, 10);

        forest.render();

        System.out.println("Unique tree types created: " + forest.getUniqueTreeTypesCount());
    }
}
