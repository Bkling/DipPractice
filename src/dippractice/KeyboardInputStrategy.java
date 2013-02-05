package dippractice;

import java.util.Scanner;

public class KeyboardInputStrategy implements InputStrategy {

    @Override
    public String inputMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter some input: ");
        String msg = keyboard.nextLine();
        return msg;
    }
}
