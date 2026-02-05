import exception.InvalidException;
import exception.UserValidator;

import java.util.Scanner;

public class UserRegistration {

    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[A-Za-z]{2,}){1,2}$";
    public static final String MOBILE_REGEX = "[0-9]{2}\\s[0-9]{10}";
    public static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[!@#$%^&*]){1}).{8,}$";

    // ===== LAMBDA VALIDATORS =====
    public static UserValidator firstNameValidator = firstName -> {
        if (!firstName.matches(NAME_REGEX)) {
            throw new InvalidException("Invalid First Name ");
        }
    };

    public static UserValidator lastNameValidator = lastName -> {
        if (!lastName.matches(NAME_REGEX)) {
            throw new InvalidException("Invalid Last Name ");
        }
    };

    public static UserValidator emailValidator = email -> {
        if (!email.matches(EMAIL_REGEX)) {
            throw new InvalidException("Invalid Email Address ");
        }
    };

    public static UserValidator mobileValidator = mobile -> {
        if (!mobile.matches(MOBILE_REGEX)) {
            throw new InvalidException("Invalid Mobile Number ");
        }
    };

    public static UserValidator passwordValidator = password -> {
        if (!password.matches(PASSWORD_REGEX)) {
            throw new InvalidException("Invalid Password ");
        }
    };

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter First Name");
            String firstName = scan.next();
            firstNameValidator.validate(firstName);
            System.out.println("Valid First Name");

            System.out.println("Enter Last Name");
            String lastName = scan.next();
            lastNameValidator.validate(lastName);
            System.out.println("Valid Last Name");

            System.out.println("Enter Email");
            String email = scan.next();
            emailValidator.validate(email);
            System.out.println("Valid Email");

            System.out.println("Enter Mobile Number with Country Code");
            scan.nextLine();
            String mobile = scan.nextLine();
            mobileValidator.validate(mobile);
            System.out.println("Valid Mobile Number");

            System.out.println("Enter your Password");
            String password = scan.next();
            passwordValidator.validate(password);
            System.out.println("Valid Password");

        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
