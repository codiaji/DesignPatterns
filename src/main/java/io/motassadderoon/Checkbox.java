package io.motassadderoon;

class Checkbox extends Component {
    private boolean checked = false;

    public Checkbox(Mediator mediator) {
        super(mediator);
    }

    public void toggle() {
        checked = !checked;
        System.out.println("Checkbox toggled: " + (checked ? "Remember Me Checked" : "Remember Me Unchecked"));
        mediator.notify(this, "toggle");
    }

    public boolean isChecked() {
        return checked;
    }
}