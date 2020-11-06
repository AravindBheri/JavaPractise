import javax.swing.*;

public class MyFrame extends JFrame {
    
    private static final long serialVersionUID = 1L;

    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }
    
}
