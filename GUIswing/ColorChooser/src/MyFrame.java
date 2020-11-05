import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JButton button;
    JLabel label;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);
        button.setFocusable(false);

        label = new JLabel();
        label.setText("JAVA is FUN!");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setBackground(Color.white);
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) {

            new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);

            label.setForeground(color);

        }

    }
}
