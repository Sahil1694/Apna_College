import java.util.Scanner;

public class user {

    public static void main(String [] args) {
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
int numbers[] = new int[size];

for( int i = 0; i < size; i++){
    numbers[i] = scan.nextInt();
}
System.out.println("enter x :");
int x = scan.nextInt();
        
        
for(int i = 0; i <size; i++){

    if(numbers[i] ==x){
        System.out.println(" x found at index :" + i);
    }


}

    }
    
}
