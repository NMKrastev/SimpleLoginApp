import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame("Login");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOrigin) {

        loginInfo = loginInfoOrigin;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
