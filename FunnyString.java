//Question 2
import java.util.*;
public class FunnyString{
    public static void main (String args[]){
    
    //read input
    Scanner in = new Scanner (System.in);
    
    //just to make it friendly
    System.out.println("Hello User!!");
    
    //User ask to input their favourite colour
    //variable colo to represent colour
    System.out.println("\nWhat is your favourite colour?");
    String colo = in.nextLine();
    
    //User ask to input their favourite food
    //variable food to represent food
    System.out.println("\nWhat is your favourite food?");
    String food = in.nextLine();
    
    //User ask to input their favourite animal
    //variable ani to represent animal
    System.out.println("\nWhat is your favourite animal?");
    String ani = in.nextLine();
    
    //User ask to input their friend's first name
    //variable first to represent first name
    System.out.println("\nWhat is your friend's first name?");
    String first = in.nextLine();
    
    //using the format string 
    System.out.printf("\nI had a dream that %s ate %s %s and said it tasted like %s!", first, colo, ani, food);
    
    }
}