import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JLabel label;

    ImageIcon cool;
    ImageIcon clown;
    ImageIcon sad;
    ImageIcon wow;

    MyFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();

        cool = new ImageIcon("cool.png");
        clown = new ImageIcon("clown.jpg");
        wow = new ImageIcon("wow.jpg");
        sad = new ImageIcon("sad.jpg");

        label.setIcon(clown);

        this.addMouseListener(this);
        this.add(label);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        label.setIcon(cool);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        label.setIcon(wow);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        label.setIcon(sad);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        label.setIcon(clown);

    }
    
}
