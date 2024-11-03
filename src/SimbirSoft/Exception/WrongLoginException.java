package SimbirSoft.Exception;

// Пользовательское исключение для неверного логина
class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}