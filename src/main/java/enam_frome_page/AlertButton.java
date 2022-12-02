package enam_frome_page;

public enum AlertButton {

    ALERT("JS Alert"),
    CONFIRM("JS Confirm"),
    PROMPT("JS Prompt");

    private String textOnButton;

    AlertButton(String textOnButton) {
        this.textOnButton = textOnButton;
    }

    public String getTextOnButton() {
        return textOnButton;
    }

    @Override
    public String toString() {
        return textOnButton;
    }

}
