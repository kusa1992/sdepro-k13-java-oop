package lesson_09_02;

public class InternalLoginPage extends LoginPage {

    @Override
    protected String usernameLocator() {
        return "InternalLoginPage | usernameLocator";
    }

    @Override
    protected String passwordLocator() {
        return "InternalLoginPage | passwordLocator";
    }

    @Override
    protected String loginBtnLocator() {
        return "InternalLoginPage | loginBtnLocator";
    }
}
