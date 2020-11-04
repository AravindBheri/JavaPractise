import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Launchpage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    Launchpage() {

        button.setBounds(50, 100, 150, 30);
        button.addActionListener(this);
        button.setFocusable(false);

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button) {
            
            frame.dispose();
            new Newwindow();

        }
    }
}
