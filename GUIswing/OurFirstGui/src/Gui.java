import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui implements ActionListener {

    int count = 0;
    JFrame frame;
    JPanel panel;
    JLabel label;

    public Gui() {

        frame = new JFrame();

        JButton button = new JButton("Click me!");
        button.addActionListener(this);

        label = new JLabel("Number of Clicks: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) throws Exception {

        new Gui();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        count++;
        label.setText("Number of Clicks: " + count);

    }
}
