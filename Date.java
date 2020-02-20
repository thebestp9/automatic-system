import java.util.*;
public class Date{
    public static void main (String args[]){
    
    
    //read input
    Scanner in = new Scanner (System.in);
    
    String date;
    
    //asking the user to enter the date
    //the user should follow the format
    System.out.println("Enter the date in the format day/month/year");
    System.out.println("Example: 01/01/2001");
    
    //user enter the input for date variable
    date = in.nextLine();
    
    // '/' sign will be replaced by '.'
    String newDate = date.replace('/', '.');
    
    //a new format will show
    System.out.println(newDate);
    
    }
}