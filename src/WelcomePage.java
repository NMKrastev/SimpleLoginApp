import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("You have logged in successfully");

    WelcomePage() {

        welcomeLabel.setBounds(30, 150, 350, 35);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        welcomeLabel.setForeground(Color.green);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
