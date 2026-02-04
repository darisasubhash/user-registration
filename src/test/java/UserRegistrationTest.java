import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import exception.InvalidException;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenValidFirstNameNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.validateFirstName("Subhash"));
    }

    @Test
    void givenValidLastNameNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.validateLastName("Darisa"));
    }

    @Test
    void givenValidEmailNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.validateEmail("abc.100@abc.com"));
    }

    @Test
    void givenValidMobileNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.validateMobile("91 9919812436"));
    }

    @Test
    void givenValidPasswordNotThrowsException() {
        assertDoesNotThrow(()->UserRegistration.validatePassword("Subh@123"));
    }


    @Test
    void givenInvalidFirstNameThrowsException() {
        assertThrows(InvalidException.class, () -> UserRegistration.validateFirstName("subhash"));
    }

    @Test
    void givenInvalidLastNameThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.validateLastName("darisa"));
    }

    @Test
    void givenInvalidEmailThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.validateEmail("abc..2002@gmail.com"));
    }

    @Test
    void givenInvalidMobileThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.validateMobile("919919819801"));
    }

    @Test
    void givenInvalidPasswordThrowsException() {
        assertThrows(InvalidException.class,()->UserRegistration.validatePassword("abcdefg@"));
    }
}
