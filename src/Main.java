import presenter.Presenter;
import view.LoginForm;

public class Main {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        Presenter presenter = new Presenter(loginForm);
        loginForm.setPresenter(presenter);
        loginForm.showLoginForm();
    }
}
