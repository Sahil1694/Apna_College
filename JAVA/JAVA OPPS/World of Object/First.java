class Pen {
    String color;
    String type;

    public void write(){
        System.err.println("writting something");
    }

public  void printColor() {
    System.out.println(this.color);   
}
public void printtype() {
    System.out.println(this.type);
}

}   
class Student{
    String name;
    int age;
public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age); 
    
 
    
}
Student( String name, int age){
this.name = name;
this.age = age;
}
}

public class First{
public static void main(String args[]) {
    // Pen pen1 = new Pen();
    // pen1.color = "blue";
    // pen1.type = "gel";

    // Pen pen2 = new Pen();
    // pen2.color = "Black";
    // pen2.type ="ballpoint";

    // pen1.printColor();
    // pen2.printColor();
    // pen1.printtype();


Student s1 = new Student("Sahil", 24);
s1.printInfo();
// s1.name="Sahil";
// s1.age=18;

// s1.printInfo();


    
}

}



