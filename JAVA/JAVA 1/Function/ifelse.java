public class ifelse {
    public static void main( String[] args) {
        
        double measure1 =  measureRectangle(4.3,2.2 , "area");
        double measure1 =  measureRectangle(4.3,2.2 , "area");

        stringPrinter(4.3, 2.2, measure1);
        stringPrinter(4.3, 2.2, measure1);
    }

public static double measureRectangle(double length , double width ,String option)
switch(option){
case "area" : return length * width;
case "perimeter" : return 2 *(length + width);
default: return 404;
}
    


public static void stringPrinter(double length, double width,double area,String option)
 System.out.println("the" + option + "of a rectangle with length" + length + "and" + width + " is equal to"+ area + "\n");
    
}
