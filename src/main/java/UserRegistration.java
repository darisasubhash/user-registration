import java.util.Scanner;

public class UserRegistration {
    public static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[A-Za-z]{2,}){1,2}$";
    public static final String MOBILE_REGEX = "[0-9]{2}\\s[0-9]{10}";
    public static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[!@#$%^&*]){1}).{8,}$";
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scan.next();
        System.out.println(validateFirstName(firstName)
                ? "Valid First Name" : "Invalid First Name");

        System.out.println("Enter Last Name");
        String lastName = scan.next();
        System.out.println(validateLastName(lastName)
                ? "Valid Last Name" : "Invalid Last Name");

        System.out.println("Enter Email");
        String email = scan.next();
        System.out.println(validateEmail(email)
                ? "Valid Email" : "Invalid Email");

        System.out.println("Enter Mobile Number with Country Code");
        scan.nextLine(); // clear buffer
        String mobile = scan.nextLine();
        System.out.println(validateMobile(mobile)
                ? "Valid Mobile Number" : "Invalid Mobile Number");

        System.out.println("Enter your Password");
        String password = scan.next();
        System.out.println(validatePassword(password)
                ? "Valid Password" : "Invalid Password");
    }

    public static boolean validateFirstName(String firstName) {
        return firstName.matches(NAME_REGEX);
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches(NAME_REGEX);
    }

    public static boolean validateEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static boolean validateMobile(String mobile) {
        return mobile.matches(MOBILE_REGEX);
    }

    public static boolean validatePassword(String password) {
        return password.matches(PASSWORD_REGEX);
    }
}
