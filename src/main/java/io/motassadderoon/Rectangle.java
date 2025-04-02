package io.motassadderoon;

public class Rectangle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.render(this);
    }
}
