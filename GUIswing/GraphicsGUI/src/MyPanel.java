package GUIswing.GraphicsGUI.src;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    
    private static final long serialVersionUID = 1L;

    Image image;

    MyPanel() {

        image = new ImageIcon("C:\\Users\\Aravind\\Desktop\\JavaPractise\\GUIswing\\RocketKeyListener\\images.jpg").getImage();
        this.setPreferredSize(new Dimension(500, 500));

    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        // g2D.fillOval(100, 100, 200, 200);

        // g2D.setPaint(Color.red);
        // g2D.fillArc(100, 100, 300, 300, 0, 180);
        
        // g2D.setPaint(Color.white);
        // g2D.fillArc(100, 100, 300, 300, 180, 180);

        // int[] xPoints = {150, 250, 350};
        // int[] yPoints = {300, 150, 300};
        // g2D.fillPolygon(xPoints, yPoints, 3);

        g2D.drawImage(image, 0, 0, null);

    }

}
