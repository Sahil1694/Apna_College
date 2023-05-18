import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Hello . What is Your name ?");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + " I am javabot. Where are you from ?");
        String home = scan.nextLine();

System.out.println("\nI hear its Beautiful at " + home +  " I'm from a place called Orcale") ;
System.out.println("\nHow old are you ?");
int age = scan.nextInt();

System.out.println("\nso you are " + age + " old"); 
System.out.println("\nThis means I'm " + (400 / age) +  " times older than you");
System.out.println("\nWhat is Your Fav languague ??");
scan.nextLine();
String languague = scan.nextLine();

System.out.println("\nSo " + name + " Fav languague is " + languague + ".");


    }
}