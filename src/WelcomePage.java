import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeUserLabel = new JLabel("Hello!");
    JLabel welcomeLabel = new JLabel("You have logged in successfully!");

    WelcomePage(String userID) {

        welcomeUserLabel.setBounds(30, 100, 350, 35);
        welcomeUserLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        welcomeUserLabel.setForeground(Color.black);
        welcomeUserLabel.setText("Hello " + userID + "!");

        welcomeLabel.setBounds(30, 200, 350, 35);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        welcomeLabel.setForeground(Color.green);

        frame.add(welcomeUserLabel);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
