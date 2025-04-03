package io.motassadderoon;

import java.util.*;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();
    private final Map<BaseTree,Integer> baseTrees= new HashMap<>();
    private static Integer numberDifferentPlantedTrees=0;
    public void plantTree(String type, String color, String texture, int x, int y) {
        Integer keyBaseTree=getKeyOfTheBaseTree(type,color,texture);
        Tree tree = new Tree(keyBaseTree, x, y);
        trees.add(tree);
    }

    private Integer getKeyOfTheBaseTree(String type, String color, String texture) {
        BaseTree newBaseTree = new BaseTree(type, color, texture);
        if (baseTrees.containsKey(newBaseTree))
            return baseTrees.get(newBaseTree);
        else {
            int currentKey=numberDifferentPlantedTrees;
            baseTrees.put(newBaseTree, numberDifferentPlantedTrees++);
            return currentKey;
        }
    }
    private void renderBaseTree(Integer value) {
        for (Map.Entry<BaseTree, Integer> entry : baseTrees.entrySet()) {
            if (entry.getValue().equals(value)) {
                entry.getKey().render();
            }
        }
    }
    public void render() {
        for (Tree tree : trees) {
            renderBaseTree(tree.getBaseTreeID());
            tree.render();
        }
    }
}
