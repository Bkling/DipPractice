package dippractice;

import javax.swing.JOptionPane;

public class GuiOutputStrategy implements OutputStrategy {
    //This overrides the outputMessage implemented from the OutputStrategy
    @Override
    public void outputMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
