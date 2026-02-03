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
    }
}