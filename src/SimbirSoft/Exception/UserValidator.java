package SimbirSoft.Exception;

public class UserValidator {

    public static boolean validateUser(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Неверный логин. Логин должен содержать только латинские буквы, цифры и знак подчеркивания, и его длина должна быть меньше 20 символов.");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Неверный пароль. Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, и его длина должна быть меньше 20 символов.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
        }
    }
}
