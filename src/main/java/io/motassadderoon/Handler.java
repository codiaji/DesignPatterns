package io.motassadderoon;

public abstract class Handler {
    protected Handler next;

    public Handler linkWith(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(Request request) {
        if (!process(request) && next != null) {
            next.handle(request);
        }
    }

    protected abstract boolean process(Request request);
}
