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
        String regex3="^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[A-Za-z]{2,}){1,2}$";
        if(email.matches(regex3)){
            System.out.println("Valid Email ");
        }
        else{
            System.out.println("Invalid Email ");
        }
        runTestCases(regex3);
        System.out.println("Enter Mobile Number with Country Code ");
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
        String regex5= "^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[!@#$%^&*]){1}).{8,}$";
        if(password.matches(regex5)){
            System.out.println("Valid Password ");
        }
        else{
            System.out.println("Invalid Password ");
        }
    }
    private static void runTestCases(String regex){
        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };
        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };
        System.out.println("Testing Valid Emails ");
        for(String vemail:validEmails){
            System.out.println(vemail +"  "+vemail.matches(regex));
        }
        System.out.println("Testing Invalid Emails ");
        for(String inemail:invalidEmails){
            System.out.println(inemail +"  "+inemail.matches(regex));
        }
    }
}