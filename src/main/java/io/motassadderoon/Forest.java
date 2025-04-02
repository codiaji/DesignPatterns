package io.motassadderoon;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(String type, String color, String texture, int x, int y) {
        Tree tree = new Tree(type, color, texture, x, y);
        trees.add(tree);
    }

    public void render() {
        for (Tree tree : trees) {
            tree.render();
        }
    }
}
