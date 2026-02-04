import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenValidFirstNameReturnTrue() {
        assertTrue(UserRegistration.validateFirstName("Subhash"));
    }

    @Test
    void givenValidLastNameReturnTrue() {
        assertTrue(UserRegistration.validateLastName("Darisa"));
    }

    @Test
    void givenValidEmailReturnTrue() {
        assertTrue(UserRegistration.validateEmail("abc.100@abc.com"));
    }

    @Test
    void givenValidMobileReturnTrue() {
        assertTrue(UserRegistration.validateMobile("91 9919819801"));
    }

    @Test
    void givenValidPasswordReturnTrue() {
        assertTrue(UserRegistration.validatePassword("Subh@123"));
    }


    @Test
    void givenInvalidFirstNameReturnFalse() {
        assertFalse(UserRegistration.validateFirstName("subhash"));
    }

    @Test
    void givenInvalidLastNameReturnFalse() {
        assertFalse(UserRegistration.validateLastName("dar"));
    }

    @Test
    void givenInvalidEmailReturnFalse() {
        assertFalse(UserRegistration.validateEmail("abc..2002@gmail.com"));
    }

    @Test
    void givenInvalidMobileReturnFalse() {
        assertFalse(UserRegistration.validateMobile("919919819801"));
    }

    @Test
    void givenInvalidPasswordReturnFalse() {
        assertFalse(UserRegistration.validatePassword("abcdefg@"));
    }
}
