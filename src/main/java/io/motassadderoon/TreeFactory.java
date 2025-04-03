package io.motassadderoon;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, BaseTree> treeCache = new HashMap<>();

    public static BaseTree getTree(String type, String color, String texture) {
        String key = type + "-" + color + "-" + texture;
        return treeCache.computeIfAbsent(key, k -> new BaseTree(type, color, texture));
    }

    public static int getTreeTypesCount() {
        return treeCache.size();
    }
}
