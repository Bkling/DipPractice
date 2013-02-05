package dippractice;

public class MessageService {

    //private static final String MSG = "Hello";
    private String msg;
    private OutputStrategy out;
    private InputStrategy in;

    public MessageService(InputStrategy in, OutputStrategy out) {
        this.in = in;
        this.out = out;
    }

    public void outputMessage() {
        out.outputMessage(msg);
    }

    public void inputMessage() {
        msg = in.inputMessage();
    }
}
