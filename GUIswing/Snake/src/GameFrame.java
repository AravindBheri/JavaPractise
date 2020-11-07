import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    private static final long serialVersionUID = 1L;

    GameFrame() {

        this.add(new GamePanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Snake");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
}
