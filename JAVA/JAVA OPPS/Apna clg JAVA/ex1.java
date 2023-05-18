class Student{
String name;
int age;

public void getInfo(){
    System.out.println("THE " + this.name);
    System.out.println("THE "+ this.age);
}
public void S() {
    System.out.println(" NAme " + this.name );
    
}


}

public class ex1 {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.name="SAHIL"        ;
    s1.age=18;
    s1.getInfo();

    Student s2 = new Student();
    s2.name = "Sejal ";
    s2.age = 20;
    s2.S();
    }
    
}