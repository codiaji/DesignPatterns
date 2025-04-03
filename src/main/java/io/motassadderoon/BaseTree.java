package io.motassadderoon;

import java.util.Objects;

public class BaseTree {
    private final String type;
    private final String color;
    private final String texture;

    public BaseTree(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseTree baseTree = (BaseTree) o;
        return this.type.equals(baseTree.getType()) &&
                this.color.equals(baseTree.getColor()) &&
                this.texture.equals(baseTree.getTexture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,color,texture);
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
    public void render() {
        System.out.print("Rendering " + type + " tree with color " + color+" ");
    }
}
