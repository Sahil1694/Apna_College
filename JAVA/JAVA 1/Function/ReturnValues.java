public class ReturnValues {
    public static void main(String[] args) {
     
       double measure1 =  measureRectangle(4.3,2.2 , "area");
       double measure2 =  measureRectangle(4.3,2.2, "peremeter");
       
stringPrinter(4.3, 2.2, measure1);
stringPrinter(4.3, 2.2, measure2);



    }
public static double measureRectangle(double length,Double width, String option) {
    switch (option) {
case "area" : return length * width;
case "perimerter" : return 2 * ( length + width );
default : return 5;

    }
    
}
public static void stringPrinter(double length, double width,double area) {
    System.out.println("The area of a rectangele with length " + length + " and width" + width + " is equal to " + area + "\n");


}



}
