//Question 1
public class StringExercise{
    public static void main (String args[]){
    
    String college = new String ("College of Arts and Sciences");

    //Question (a)
    //creating a new object
    String town = new String (" UUM Sintok"); 
    
    int stringLength;
    String change1, change2, change3;
    
    //Question (b)
    //using the int length() method
    //will calculate the length of the characters
    stringLength = (college.length());
        System.out.println(college + " contains " + stringLength + " characters.");
    
    //Question (c)
    //using the String toUpperCase() method
    // the string will be in uppercase
    change1 = college.toUpperCase();
        System.out.println("The string is all in upper case: " + change1);
        
    //Question(d)
    //using the String replace(char old, char new) method
    // letter 'O' will change to '*'
    change2 = change1.replace('O', '*');
        System.out.println("All capital O's are replaced with the asterisk character: " + change2); 
        
    //Question (e)
    //using the String concat(String str)
    //String college will combine with string town
    change3 = college.concat(town);
        System.out.println("The final string is " + change3);
        
    }
}       