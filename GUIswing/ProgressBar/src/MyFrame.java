import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyFrame extends JFrame {

    JFrame frame;
    JProgressBar progressBar = new JProgressBar();

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);

        progressBar.setValue(0);
        progressBar.setBounds(0, 0, 420, 35);
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.BLACK);

        this.add(progressBar);
        this.setLayout(null);
        this.setVisible(true);

        fill();
    }

    public void fill() {

        int counter = 0;

        while (counter <= 100) {

            progressBar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            counter += 1;
        }
    }
}
