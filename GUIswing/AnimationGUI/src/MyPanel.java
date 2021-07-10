package GUIswing.AnimationGUI.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener {
    
    private static final long serialVersionUID = 1L;

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image space;
    Image rocket;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    MyPanel() {

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        // space = new ImageIcon("space.jpg").getImage();
        rocket = new ImageIcon("C:\\Users\\Aravind\\Desktop\\JavaPractise\\GUIswing\\RocketKeyListener\\images.jpg").getImage();
        
        timer = new Timer(1, this);
        timer.start();

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        // g2D.drawImage(space, x, y, null);
        g2D.drawImage(rocket, x, y, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (x >= PANEL_WIDTH - rocket.getWidth(null) || x < 0) {

            xVelocity *= -1;

        }

        x += xVelocity;

        if (y >= PANEL_HEIGHT - rocket.getHeight(null) || y < 0) {

            yVelocity *= -1;

        }

        y += yVelocity;
    
        repaint();

    }

}
