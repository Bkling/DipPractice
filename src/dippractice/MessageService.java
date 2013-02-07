package dippractice;

public class MessageService {
    //Properties of the MessageService Class
    private String msg;
    private OutputStrategy out;
    private InputStrategy in;
    //This is the constructor class of the MessageService
    public MessageService(InputStrategy in, OutputStrategy out) {
        this.in = in;
        this.out = out;
    }
    //This is the outputMessage from the outputStrategy
    public void outputMessage() {
        out.outputMessage(msg);
    }
    //This is the inputMessage from the InputStrategy
    public void inputMessage() {
        msg = in.inputMessage();
    }
}
