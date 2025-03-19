package io.motassadderoon;

class Button extends Component {
    public Button(Mediator mediator) {
        super(mediator);
    }

    public void click() {
        System.out.println("Login Button clicked");
        mediator.notify(this, "click");
    }
}