package dippractice;

import javax.swing.JOptionPane;

public class JOptionPaneInputStrategy implements InputStrategy {

    @Override
    public String inputMessage() {
       return JOptionPane.showInputDialog("Enter Text", "");
    }
}
