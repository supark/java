package quiz2;
import java.util.*;
public class Quiz2 {
  public static void main (String args[]){
    Scanner in = new Scanner (System.in);
    System.out.println("Please enter a string: ");
    String input = in.nextLine();
    System.out.println(IsInLanguage(input));
  }
  
    public static boolean IsInLanguage (String n){

        int length = n.length();

        if (length == 0) //if(n.equals(""))
            return true;

        else if (n.startsWith("a") && n.endsWith("bb")) 
//if(n.charAt(0)=='a') && (n.substring(length()-2, length()).equals("bb"))
            return IsInLanguage(n.substring(1, n.length()-2));

       // else 
            return false;
    }
}
