package GUIswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setVisible(true);

        JLabel label = new JLabel();
        label.setText("Hello");
        frame.add(label);
    }
}
