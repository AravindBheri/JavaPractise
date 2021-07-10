package GUIswing.FileChoosers.src;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 3724383594291582758L;
    
    JFrame frame;
    JButton button;

    MyFrame() {

        button = new JButton("Select a file");
        button.setFocusable(false);

        button.addActionListener(this);

        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            //int response = fileChooser.showSaveDialog(null);
            int response = fileChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {

                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);

            }
        }

    }
}
