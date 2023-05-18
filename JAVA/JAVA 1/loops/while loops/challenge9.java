import java.util.Scanner;

public class challenge9 {
    public static void main(String [] args) {

String username = "sahil";
String password = "ssk";

Scanner scan = new Scanner(System.in);
System.out.println("\nWelcome to Instagram ! Sign in below\n");
System.out.println(".Username");
String usernameEntry = scan.nextLine();
System.out.println(".password");
String passwordEntry = scan.nextLine();


while(!usernameEntry.equals(username) || !passwordEntry.equals(password)){
System.out.println("\nIncorrect,please try again\n");
System.out.println(".username");
usernameEntry= scan.nextLine();
System.out.println(".password");
passwordEntry= scan.nextLine();

}

System.out.println("\n Sign in successful. Welcome");
scan.close();
        
    }
    
}
