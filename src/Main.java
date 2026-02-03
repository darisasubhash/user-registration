import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Name ");
        String firstName=scan.next();
        String regex1="^[A-Z][a-z]{2,}$";
        if(firstName.matches(regex1)){
            System.out.println("Valid First Name ");
        }
        else{
            System.out.println("Invalid First Name ");
        }
        System.out.println("Enter Last Name ");
        String lastName=scan.next();
        String regex2="^[A-Z][a-z]{2,}$";
        if(firstName.matches(regex2)){
            System.out.println("Valid Last Name ");
        }
        else{
            System.out.println("Invalid Last Name ");
        }
        System.out.println("Enter Email ");
        String email= scan.next();
        scan.nextLine();
        String regex3="^[a-z]{3,}(\\.[a-z]{3,})?@[a-z]{2,}\\.[a-z]{2,}(\\.[a-z]{2,})?$";
        if(email.matches(regex3)){
            System.out.println("Valid Email ");
        }
        else{
            System.out.println("Invalid Email ");
        }
        System.out.println("Enter MObile Number with Country Code ");
        String mobile= scan.nextLine();
        String regex4="[0-9]{2}\\s[0-9]{10}";
        if(mobile.matches(regex4)){
            System.out.println("Valid Mobile Number  ");
        }
        else{
            System.out.println("Invalid Mobile Number ");
        }
        System.out.println("Enter your Password ");
        String password= scan.next();
        String regex5="^(?=.*[A-Z]).{8,}$";
        if(password.matches(regex5)){
            System.out.println("Valid Password ");
        }
        else{
            System.out.println("Invalid Password ");
        }
    }
}