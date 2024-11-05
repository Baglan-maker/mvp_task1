package view;

import presenter.Presenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm implements LoginView {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private Presenter presenter;

    public LoginForm() {
        JFrame frame = new JFrame("Login Form");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.onLoginButtonClick();
            }
        });
    }

    @Override
    public void showLoginForm() {
        // Could add additional UI initialization here if needed
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String getUsername() {
        return usernameField.getText();
    }

    @Override
    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
