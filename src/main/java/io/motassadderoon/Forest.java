package io.motassadderoon;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(String type, String color, String texture, int x, int y) {
        BaseTree baseTree = TreeFactory.getTree(type, color, texture);
        trees.add(new Tree(baseTree, x, y));
    }

    public void render() {
        for (Tree tree : trees) {
            tree.render();
        }
    }

    public int getUniqueTreeTypesCount() {
        return TreeFactory.getTreeTypesCount();
    }
}
