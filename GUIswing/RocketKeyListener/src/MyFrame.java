import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JLabel label;
    ImageIcon icon;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLayout(null);

        icon = new ImageIcon("images.jpg");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(0, 0, 230, 230);

        this.addKeyListener(this);

        this.add(label);
        this.getContentPane().setBackground(Color.white);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        switch (e.getKeyChar()) {

            case 'a' : label.setLocation(label.getX() - 5, label.getY());
            break;
            case 'w' : label.setLocation(label.getX(), label.getY() - 5);
            break;
            case 's' : label.setLocation(label.getX(), label.getY() + 5);
            break;
            case 'd' : label.setLocation(label.getX() + 5, label.getY());
            break;

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch (e.getKeyCode()) {

            case 37 : label.setLocation(label.getX() - 5, label.getY());
            break;
            case 38 : label.setLocation(label.getX(), label.getY() - 5);
            break;
            case 39 : label.setLocation(label.getX() + 5, label.getY());
            break;
            case 40 : label.setLocation(label.getX(), label.getY() + 5);
            break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
      
        System.out.println("You pressed the keyChar: " + e.getKeyChar());
        System.out.println("You pressed the keyCode: " + e.getKeyCode());

    }
}
