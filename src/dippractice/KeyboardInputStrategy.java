package dippractice;

public class KeyboardInputStrategy implements InputStrategy {

    @Override
    public void inputMessage(String msg) {
        System.out.println(msg);
    }
}
