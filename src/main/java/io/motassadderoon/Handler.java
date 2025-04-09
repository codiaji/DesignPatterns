package io.motassadderoon;

public abstract class Handler {
    private Handler nextHandler;

    public Handler() {
    }

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        handleRequest(request);
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
    protected abstract void handleRequest(Request request);
}
