package io.motassadderoon;

public class Tree {
    private final BaseTree baseTree;
    private final int x;
    private final int y;

    public Tree(BaseTree baseTree, int x, int y) {
        this.baseTree = baseTree;
        this.x = x;
        this.y = y;
    }

    public void render() {
        baseTree.render(x, y);
    }
}
