package dippractice;

public class MessageService {

    private static final String MSG = "Hello";
    private OutputStrategy out;
    private InputStrategy in;

    public MessageService(OutputStrategy out) {
        this.out = out;
    }

    public void outputMessage() {
        out.outputMessage(MSG);
    }

    public void inputMessage() {
        in.inputMessage(MSG);
    }
}
