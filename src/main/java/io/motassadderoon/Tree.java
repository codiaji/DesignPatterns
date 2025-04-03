package io.motassadderoon;

public class Tree {
    private final Integer baseTreeID;
    private final int x;
    private final int y;

    public Tree(Integer baseTreeID, int x, int y) {
        this.baseTreeID=baseTreeID;
        this.x = x;
        this.y = y;
    }

    public Integer getBaseTreeID() {
        return baseTreeID;
    }

    public void render() {
        System.out.println("at (" + x + ", " + y + ")" );
    }
}
