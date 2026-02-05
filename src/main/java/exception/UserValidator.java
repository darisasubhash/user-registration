package exception;

@FunctionalInterface
public interface UserValidator {
    void validate(String input) throws InvalidException;
}
