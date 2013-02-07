package dippractice;

import java.util.Scanner;

public class KeyboardInputStrategy implements InputStrategy {
    //This overrides the inputMessage implemented by the InputStrategy
    @Override
    public String inputMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter some input: ");
        String msg = keyboard.nextLine();
        return msg;
    }
}
