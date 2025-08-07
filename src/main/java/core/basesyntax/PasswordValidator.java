package core.basesyntax;

public class PasswordValidator {
    public void validate(User user)
            throws PasswordValidationException {

        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();

        if (password.length() < 10 || password == null
                || repeatPassword == null || !password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
