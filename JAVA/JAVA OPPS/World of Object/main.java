public class  main{
public static void main (String[] args) {

    car nissan = new car("Nissan",5000,2020,"red");

car dodge = new car("dodge" , 11000, 2019,"blue");

System.out.println(nissan.getColor());
    System.out.println("This " + nissan.getMake() + " is Worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear() +  " . It is " + nissan.color+ ". \n");

    System.out.println("This " + dodge.getMake() + " is Worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear()+ " . It is " + dodge.color+ ". \n");

}
}