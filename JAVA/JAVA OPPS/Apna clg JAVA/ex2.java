class Pen {
int age;
// String brand;

public void POCO(){
    System.out.println("THE " + this.age);
}
}

public class ex2 {
public static void main (String args[]) 
{Pen p1 = new Pen();
    p1.age = 5;
    // p1.brand = Trimax;
    p1.POCO();
    
}

    
}
