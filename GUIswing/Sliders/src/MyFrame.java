package GUIswing.Sliders.src;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame extends JFrame implements ChangeListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    JFrame frame = new JFrame("Sliders");
    JPanel panel;
    JLabel label;
    JSlider slider;

    MyFrame() {

        panel = new JPanel();
        label = new JLabel();

        slider = new JSlider(0, 100);

        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setOrientation(JSlider.VERTICAL);
        slider.setFont(new Font("MV boli", Font.PLAIN, 15));
        label.setFont(new Font("MV boli", Font.PLAIN, 35));

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        label.setText("°C = " + slider.getValue());

    }
    
}