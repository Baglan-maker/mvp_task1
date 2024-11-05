package presenter;

import view.LoginView;

public class Presenter {
    private LoginView view;

    public Presenter(LoginView view) {
        this.view = view;
    }

    public void onLoginButtonClick() {
        String username = view.getUsername();
        String password = view.getPassword();

        if (username.isEmpty() || password.isEmpty()) {
            view.showMessage("Username and password cannot be empty.");
        } else if (validateCredentials(username, password)) {
            view.showMessage("Login successful!");
        } else {
            view.showMessage("Invalid username or password.");
        }
    }

    private boolean validateCredentials(String username, String password) {
        // Hardcoded for now, but could be enhanced to check against a list of Users
        return "user".equals(username) && "password".equals(password);
    }
}
