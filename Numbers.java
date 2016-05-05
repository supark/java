/*
 Generating random powerball numbers.

 */
package Numbers;

import java.util.Arrays;  // This is for Arrays.
import java.util.Scanner;  // This is for input.

public class Numbers {  

     public static void main(String[] ar) {
         String response;  // This is for "y" or "n" of input.
         
         do {  // start do-while loop.
            System.out.println("\n");  // Making a empty new line.
            System.out.print("Enter a number between 1 and 5 for the number of groups of numbers you want to generate. ");
            
            Scanner in = new Scanner(System.in);  // This is for input data.
            int e = in.nextInt();  // This is to store the input data as an integer type.
            
            while (e <= 0 || e >= 6) {  // if the input data is not between 1 and 5, it will excute this while loop.
                System.out.print("The number must be between 1 and 5.  Try again. ");  // Asking to an user again to type correctly.
                e = in.nextInt();  // Storing the input data into the same variable name "e" to determine what to do next.
            }  // End of while loop.
           
            int balls[] = new int[5];  // This is an array for the first group.
            
            boolean[] isAlreadyGet = new boolean[70]; // To store random numbers.
            
            for (int k = 0; k < e; k++) {  // The first and second groups creates by input numbers.
            
                for (int i = 0; i < balls.length; i++) {  // This loop is for the first group that has five numbers.
                    balls[i] = ((int) (Math.random() * 69) + 1); // creating random numbers between 1 and 69.
                
                    if ((isAlreadyGet[balls[i]] == false)) {  // if the random numbers are not the same numbers, it becomes false.
                        isAlreadyGet[balls[i]] = true; // So, it goes these random numbers.
                    }  // end of if
                    else {  // If the random numbers are duplicate, 
                        i--;  // Going back, then doing creating random numbers again.
                    }  // End of else
                }  // End of the second for loop.
             
            Arrays.sort(balls);  // sorting the random numbers.
            
            System.out.print(balls[0] + " " + balls[1] + " " + balls[2] + " " + balls[3] + " " + balls[4] + " ");  // Print out group 1 numbers
            
                for (int o = 0; o < 1; o++) {  // This is for the second group number.
                    int z = ((int) (Math.random() * 26 -1+1) + 1); // Creating random number between 1 and 26. 
                    System.out.println("   " + z);  // Print out the second group number.
                }  // End of the second group for loop.
                
            System.out.println("\n");  // Making a empty new line.
            }  // end of the first for loop.
            
            System.out.print("Would you like to run the program again -- answer y/n or Y/N? ");  // Asking to user do it again or not.
            
            response = in.next();  // To store the user's answer.
            response = response.toLowerCase();  // The answer changes to a lower case.
            
            if (!(response.equals("y"))) {  // if the answer is not equal to y, which means if the user types "n", 
               System.out.println("Good Bye!!"); // showing this message.
            }
             
         }while(response.equals("y"));  // if the answer is "y", excuting do-while loop until not equal to "y".
    
  } // end of main 
}// end of class 

