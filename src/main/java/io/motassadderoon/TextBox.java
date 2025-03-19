package io.motassadderoon;

class TextBox extends Component {
    private String text = "";

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("TextBox: Setting text to '" + text + "'");
    }

    public String getText() {
        return text;
    }
}