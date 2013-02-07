package dippractice;

public class ConsoleOutputStrategy implements OutputStrategy {
    //This overrides the outputMessage implemented from the OutputStrategy
    @Override
    public void outputMessage(String msg) {
        System.out.println(msg);
    }
}
