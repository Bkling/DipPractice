package dippractice;

import javax.swing.JOptionPane;

public class JOptionPaneIntputStrategy implements InputStrategy {

    @Override
    public void inputMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
