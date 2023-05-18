import java.util.Scanner;

public class challenge8 {
    public static void main(String[] args) {

int number = 4;
System.out.println("I chose a number between 1 and 5 .try to guess it");
Scanner scan = new Scanner(System.in);
int guess = scan.nextInt();


while(guess != number){
System.out.println("Guess again");
guess = scan.nextInt();

}
System.out.println("You got it !");
scan.close();

        
    }
    
}
