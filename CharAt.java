import java.util.*;
public class CharAt{
    public static void main (String args[]){
    
    //read input
    Scanner in = new Scanner(System.in);
    
    //the user have to put a 4 digits number
    System.out.println("Enter a four digits number");
    
    //the user input
    String num = in.nextLine();
    
    //initialize the sum
    int sum = 0;
    
    //the string will only read the first 4 characters only 
    //although the user can input the characters more than 4
    for(int i = 0; i < 4; i++)
    {   
        //the characters will be printed one digits per line
        System.out.println(num.charAt(i));
        
        //the sum will be added 
        //the String will be converted into integers
        sum += Integer.parseInt("" + num.charAt(i));
    }
    
    //the sum of the integers will be printed
    System.out.println("The sum is = " + sum);
        
    }
}