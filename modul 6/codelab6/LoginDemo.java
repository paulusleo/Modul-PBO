package com.example.hellofx;

import javafx.scene.text.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Login");
        Text scenetitle = new Text("Welcome");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(10, 110, 300, 25);
        panel.add(messageLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());

                if (user.equals("leo") && password.equals("leo130305")) {
                    JFrame welcomeFrame = new JFrame("Welcome");
                    welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    welcomeFrame.setSize(400, 200);

                    JPanel welcomePanel = new JPanel();
                    welcomeFrame.add(welcomePanel);

                    JLabel welcomeLabel = new JLabel("Welcome " + user + "!");
                    welcomeLabel.setBounds(10, 20, 300, 25);
                    welcomePanel.add(welcomeLabel);

                    welcomeFrame.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(panel)).dispose();
                } else {
                    messageLabel.setText("Username / Password salah");
                }
            }
        });
    }
}

