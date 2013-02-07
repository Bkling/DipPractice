package dippractice;

import javax.swing.JOptionPane;

public class JOptionPaneInputStrategy implements InputStrategy {
    //This overrides the inputMessage implemented by the InputStrategy
    @Override
    public String inputMessage() {
        return JOptionPane.showInputDialog("Enter Text", "");
    }
}
