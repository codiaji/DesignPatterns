package io.motassadderoon;

public class Circle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.render(this);
    }
}
