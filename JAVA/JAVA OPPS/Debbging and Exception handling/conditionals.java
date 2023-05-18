public class conditionals {
    public static void main(String[] args) {
        String option = "";

        int Shape = (int) (Math.random()) * 3 + 1  ;
        
        switch (Shape) {
            case 1: option = "hit"; break;
            case 2: option = "stay"; break;
            case 3: option = "fold"; break;
            default: option = "This should never get called";
        }
     

        if (!option.equals("hit") && !option.equals("stay")) {
            System.out.println( "fold");
        } else {
            System.out.println(option); 
       } 
    }
}