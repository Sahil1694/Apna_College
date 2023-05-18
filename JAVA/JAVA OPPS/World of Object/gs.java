public class gs {
    
private String name;
private String nationality;
private String dateOfBirth;
private String[] passport;
private int seatNumber;

public gs(String name, String nationality, String dateOfBirth,
int seatNumber){
this.name = name;
this.nationality = nationality;
this.dateOfBirth = dateOfBirth;
this.seatNumber = seatNumber;
}
public String getname() {
return this.name;
}
public String getnationality(){
return this.nationality;
}
public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;


}
}
