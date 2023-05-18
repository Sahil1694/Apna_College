import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Welcome . Thank you for taking the survey");
int counter = 0;

System.out.println("What is your Name ?");
 String name = scan.nextLine();
 counter++;

System.out.println("How much money do you spend on coffe ?");
double coffeePrice = scan.nextDouble();
counter++;


System.out.println("hoe much money do you spend on fast food");
double foodPrice = scan.nextDouble();
counter++;
 
System.out.println("How many times a week do you buy coffe ?");
double coffeamount = scan.nextInt();
counter++;


System.out.println("Thank you " + name + " for answering all " + counter + " question.");
System.out.println("Your fast food expences are " + (foodPrice/coffeePrice) + " times your coffe");
System.out.println("Weekly you spend " + (coffeamount*coffeePrice) + "on coffee");
System.out.println("weekly, you spend " + (foodPrice*foodPrice) + "on food");
scan.close();
    }
}
