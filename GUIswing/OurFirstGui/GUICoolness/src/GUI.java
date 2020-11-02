import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener {

    private static JPanel panel;
    private static JFrame frame;
    private static JTextField userTextField;
    private static JTextField passwordTextField;
    private static JButton button;
    private static JLabel success;
    private static JLabel userLabel;
    private static JLabel passwordLabel;

    public static void main(String[] args) {

        panel = new JPanel();
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User: ");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userTextField = new JTextField(20);
        userTextField.setBounds(100, 20, 165, 25);
        panel.add(userTextField);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordTextField = new JTextField(20);
        passwordTextField.setBounds(100, 50, 165, 25);
        panel.add(passwordTextField);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String user = userTextField.getText();
        String password = passwordTextField.getText();

        if(user.equals("Aravind") && password.equals("VScodeaccount")) {
            success.setText("Login Successful!");
        } else {
            success.setText("Incorrect password, try again!");
        }

    }
}
