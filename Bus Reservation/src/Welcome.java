import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Welcome extends JFrame {

    public Welcome() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Welcome to Bus Booking System");
        setPreferredSize(new Dimension(600, 400));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));

        JLabel welcomeLabel = new JLabel("WELCOME");
        welcomeLabel.setFont(new Font("Verdana", Font.BOLD, 28));

        JLabel centerLabel = new JLabel("TO BUS BOOKING CENTRE");
        centerLabel.setFont(new Font("Verdana", Font.BOLD, 28));

        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        titlePanel.add(welcomeLabel);
        titlePanel.add(centerLabel);

        mainPanel.add(titlePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton userButton = createButton("USER", e -> {
            setVisible(false);
            new ULogin();
        });

        JButton adminButton = createButton("ADMIN", e -> {
            setVisible(false);
            new ALogin();
        });

        buttonPanel.add(userButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(adminButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private JButton createButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Verdana", Font.PLAIN, 18));
        button.addActionListener(actionListener);
        return button;
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                 | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome();
            }
        });
    }
}
