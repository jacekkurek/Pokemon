package exceptions;

public class DeadPokemonExeption extends Exception {
    public DeadPokemonExeption() {
    }

    public DeadPokemonExeption(String message) {
        super(message);
    }

    public DeadPokemonExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DeadPokemonExeption(Throwable cause) {
        super(cause);
    }

    public DeadPokemonExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
