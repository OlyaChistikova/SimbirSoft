package SimbirSoft.Exception;

// Пользовательское исключение для неверного пароля
class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
