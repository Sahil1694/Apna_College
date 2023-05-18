
import java.util.Scanner;

public class delarship {


public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Welcome to the Java delarship");
System.out.println(" |  Select option 'a' to buy a car " );
System.out.println(" |  Select option 'b' to sell a car " );

String option =scan.nextLine();
switch (option)
{
case "a" :  System.out.println("\nWhat is your budgets ?");
int budget = scan.nextInt();
if(budget >= 10000){
System.out.println("\nGreat ! A Wagnor is available");
System.out.println("\nDo you have insurance ? Write 'yes' or 'no'");
//scan.nextLine();
String insurance = scan.next();
System.out.println("\nDo you have a licence ? Write 'yes' or 'no' ");
String license = scan.nextLine();
System.out.println("\nWhat is your credit score ?");
int creditscore = scan.nextInt();
if(insurance.equals("yes") && license.equals("yes") && creditscore > 660)
{System.out.println("\nSold ! Pleasure doing business with you");}

else {
    System.out.println("\nWe're sorry , You are not eligible");
}



}else{
System.out.println("\nWe don't seell are cars under 10000 ,sorry!");
}break;


case "b" :
 System.out.println(" \nWhat is your value at ? ");
 int value = scan.nextInt();
 System.out.println("\nWhat is your Selling Price ?");
 int Price = scan.nextInt();

if (value > Price && Price < 30000){
System.out.println("\nWe will buy your car , Pleasure doning buiness with you !");}
else{
    System.out.println("\nsorry we're not intrested !!");
}


}

}
 







    
}