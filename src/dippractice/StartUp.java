package dippractice;

public class StartUp {

    public static void main(String[] args) {
        InputStrategy in = new JOptionPaneInputStrategy();
        OutputStrategy out = new GuiOutputStrategy();
        MessageService service = new MessageService(in, out);

        service.inputMessage();
        service.outputMessage();
    }
            
}
