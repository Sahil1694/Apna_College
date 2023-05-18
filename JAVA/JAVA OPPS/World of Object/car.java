public class car {

String make;
double price;
int year;
String color;    

public car (String make, double price, int year,String color){
this.make = make;
this.price = price;
this.year = year;
this.color = color;
 }
public String getMake() {
    return this.make;
}
public double getPrice(){
    return this.price;
}
public double getYear(){
return this.year;
}
public String getColor(){
    return this.color;
}

}