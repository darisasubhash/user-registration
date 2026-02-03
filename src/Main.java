import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Name ");
        String firstName=scan.next();
        String regex="^[A-Z][a-z]{2,}$";
        if(firstName.matches(regex)){
            System.out.println("Valid First Name ");
        }
        else{
            System.out.println("Invalid First Name ");
        }
    }
}