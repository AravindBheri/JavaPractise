package GUIswing.OpeningWindowFromaWindow.src;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Newwindow {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    Newwindow() {

        label.setText("Hello!");
        label.setBounds(30, 50, 100, 40);
        label.setFont(new Font(null, Font.BOLD, 30));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
