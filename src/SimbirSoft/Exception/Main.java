package SimbirSoft.Exception;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        String login = "user_name";
        String password = "password123";
        String confirmPassword = "password123";

        boolean isValid = UserValidator.validateUser(login, password, confirmPassword);
        System.out.println("Пользователь валиден: " + isValid);
    }
}

