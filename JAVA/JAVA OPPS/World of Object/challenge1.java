import java.util.Arrays;
public class challenge1 {

    public static void main(String[] args ) {
        cha1  person = new cha1();

        person.name = "Sahil Khilari";
        person.nationality = "Indian";
        person.dateOfBirth = "01/01/2022";
        person.passport = new String []{person.name,person.nationality,person.dateOfBirth};
        person.seatNumber = 5;
        person.name="SSK";

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
 








   
        
    }
    
}
