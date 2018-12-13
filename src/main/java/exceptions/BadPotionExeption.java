package exceptions;

public class BadPotionExeption extends Exception {



    public BadPotionExeption() {
    }

    public BadPotionExeption(String message) {
        super(message);
    }

    public BadPotionExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public BadPotionExeption(Throwable cause) {
        super(cause);
    }

    public BadPotionExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
