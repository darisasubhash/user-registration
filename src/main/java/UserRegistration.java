import exception.InvalidException;

import java.util.Scanner;

public class UserRegistration {
    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[A-Za-z]{2,}){1,2}$";
    public static final String MOBILE_REGEX = "[0-9]{2}\\s[0-9]{10}";
    public static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[!@#$%^&*]){1}).{8,}$";
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter First Name");
            String firstName = scan.next();
            validateFirstName(firstName);
            System.out.println("Valid First Name ");

            System.out.println("Enter Last Name");
            String lastName = scan.next();
            validateLastName(lastName);
            System.out.println("Valid Last Name");

            System.out.println("Enter Email");
            String email = scan.next();
            validateEmail(email);
            System.out.println("Valid Email");

            System.out.println("Enter Mobile Number with Country Code");
            scan.nextLine();
            String mobile = scan.nextLine();
            validateMobile(mobile);
            System.out.println("Valid Mobile Number");

            System.out.println("Enter your Password");
            String password = scan.next();
            validatePassword(password);
            System.out.println("Valid Password");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateFirstName(String firstName) throws InvalidException {
        if(!firstName.matches(NAME_REGEX)){
            throw new InvalidException("Invalid First Name ");
        }
    }

    public static void validateLastName(String lastName) throws  InvalidException {
        if(!lastName.matches(NAME_REGEX)){
            throw new InvalidException("Invalid Last Name ");
        }
    }

    public static void validateEmail(String email) throws InvalidException {
        if(!email.matches(EMAIL_REGEX)){
            throw new InvalidException("Invalid Email Address ");
        }
    }

    public static void validateMobile(String mobile) throws InvalidException {
        if(!mobile.matches(MOBILE_REGEX)){
            throw new InvalidException("Invalid Mobile Number ");
        }
    }

    public static void validatePassword(String password) throws InvalidException{
        if (!password.matches(PASSWORD_REGEX)){
            throw new InvalidException("Invalid Password ");
        }
    }
}
