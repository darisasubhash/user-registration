import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import exception.InvalidException;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenValidFirstNameNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.firstNameValidator.validate("Subhash"));
    }

    @Test
    void givenValidLastNameNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.lastNameValidator.validate("Darisa"));
    }

    @Test
    void givenValidEmailNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.emailValidator.validate("abc.100@abc.com"));
    }

    @Test
    void givenValidMobileNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.mobileValidator.validate("91 9919812436"));
    }

    @Test
    void givenValidPasswordNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.passwordValidator.validate("Subh@123"));
    }


    @Test
    void givenInvalidFirstNameThrowsException() {
        assertThrows(InvalidException.class, () -> UserRegistration.firstNameValidator.validate("subhash"));
    }

    @Test
    void givenInvalidLastNameThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.lastNameValidator.validate("darisa"));
    }

    @Test
    void givenInvalidEmailThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.emailValidator.validate("abc..2002@gmail.com"));
    }

    @Test
    void givenInvalidMobileThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.mobileValidator.validate("919919819801"));
    }

    @Test
    void givenInvalidPasswordThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.passwordValidator.validate("abcdefg@"));
    }
}
