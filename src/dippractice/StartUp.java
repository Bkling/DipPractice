package dippractice;

public class StartUp {

    public static void main(String[] args) {
        OutputStrategy out = new GuiOutputStrategy();
        MessageService service = new MessageService(out);

        service.outputMessage();
    }
}
