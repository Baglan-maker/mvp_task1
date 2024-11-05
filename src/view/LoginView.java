package view;

public interface LoginView {
    void showLoginForm();

    void showMessage(String message);

    String getUsername();

    String getPassword();
}
