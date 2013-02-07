package dippractice;

public class StartUp {

    public static void main(String[] args) {
        //Using Liskov Substitution Principle, makes them swapable
        InputStrategy in = new JOptionPaneInputStrategy();
        OutputStrategy out = new GuiOutputStrategy();
        MessageService service = new MessageService(in, out);
        //Call the service methods
        service.inputMessage();
        service.outputMessage();
    }
}
