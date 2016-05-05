
package quiz;

import java.util.*;

public class Quiz {

        static int num;
        static String a = "";
        static String b = "";
        static int i = 0;
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = in.nextInt();
        
        System.out.println(ab());
    }
    
    public static String ab() {
        
        a += "a"; b +="bb"; i += 1;
        
        String result = a+b;
      
        if (i == num)
            return result;
        return ab();   
    }
}
