public class condition {
    public static void main(String[] args) {
        double wallet = 2;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");

        if (wallet >= toyCar)
       {System.out.println("Yes, Sure !!");}
       else{System.out.println("Sorry , I have " + wallet + " left");}
       
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.

        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");

        System.out.println("Can I get this car?");

        if (wallet >= nike)
       {System.out.println("Yes, Sure !!");}
       else{System.out.println("Sorry , I have " + wallet + " left");}
    }
}