/*
Class : CSC 3410
Computer number : 16395
Professor : J.L. Bhola
Homework #2
Name : Jeongsu Park

purpose : This program prompts the user for the name of a file and then counts 
the occurrences of words, lines, alphanumeric characters, sentences, vowels(lower and upper case), 
and punctuations in the file.  It then reports the frequencies on the screen as well
as an output file name "output.txt". 

Algorithm : 
    step 1: Start
    step 2: Getting for an input file name
    step 3: Begin try block
    step 4: Reading the input file
    step 5: Checking the input file is empty or not.  Then, if the input file is empty, printing the message and 
            terminating the program
    step 6: Declare variables
    step 7: Reading the input file using while(in1.hasNext())
    step 8: Counting words
    step 9: Counting alphanumeric characters by isLetterOrDigit boolean method
    step 10: Counting sentences using nested for loop by characters matching
    step 11: Counting vowels using another nested for loop by characters matching
    step 12: Counting punctuations using another nested for loop by characters matching
    step 13: Reading each lines of the input file using while(in2.hasNextLine())
    step 14: Printing out the result on the screen
    step 15: Printing out the result in the output.txt
    step 16: Closing the input and output files
    step 17: Closing try block
    step 18: catch block
    step 19: Stop

Data Structure : none

 */
package wordcount;

import java.io.*;
import java.util.*;

public class Wordcount {

    public static void main(String[] ar)
    {
        Scanner console = new Scanner(System.in); //This is for input data from a user.
        System.out.print("Input file : ");  //Asking to a user for an input file
        String inputFileName = console.next();  //Input file name will be storing as an inputFileName String.
        File inputFile = new File(inputFileName);  //Putting in the file name as an inputFileName String.
        try {  //begins try
        Scanner in = new Scanner(new FileReader(inputFile));  //Reading a file using Scanner
        PrintWriter out = new PrintWriter("output.txt");  //Creating an output file as an output.txt file
            if(!(in.hasNextLine())) {  //If an input file is empty,
                    System.out.println("the input file is empty");  //Print the "the input file is empty
                    System.exit(0);}  //Terminating the program.
        int wcount = 0, lcount = 0, acount = 0, scount = 0, vcount = 0, pcount = 0, i=0;  //Initializing integer variables.
        String token1 = "", token2="";  //Initializing String variables.
        //Initializing character arrays
        char ch4[]={'!','.','?'};
        char ch5[]={'a','e','i','o','u','A','E','I','O','U'};
        char ch6[]={'.','?',':',';','-','-','_','(',')','[',']','{','}','"',',','*','&','^','%','$','#','@','!'};
        //Creating another Scanners to look for words and lines
        Scanner in1 = new Scanner(new File(inputFileName)).useDelimiter("[\n ]");
        Scanner in2 = new Scanner(new File(inputFileName)).useDelimiter("\n");
            while (in1.hasNext()) { //If an input file isn't empty, the next method of the scanner class reads the next string.
                token1 = in1.next();  //Storing strings in token1
                wcount++; //Counting the amount of words by space and newline
                for (i = 0; i < token1.length(); i++) {  //Going through every single letters
                    char ch = token1.charAt(i);  //Storing in a character ch
                    if (Character.isLetterOrDigit(ch)) {  //Looking for alphanumeric characters
                        acount++;} //Counting alphanumeric characters
                } // end of for loop
                for ( i = 0; i < token1.length(); i++) { 
                    char ch = token1.charAt(i);
                    for (int j = 0; j < ch4.length; j++) {  //Finding matching !.? characters to count how many sentences there are
                        if (ch == ch4[j]) {  //If finding matching !.? characters
                            scount++;}  //Counting sentences
                    }
                }
                for ( i = 0; i < token1.length(); i++) {
                    char ch = token1.charAt(i);
                    for (int k = 0; k < ch5.length; k++) {  //Finding matching vowels(upper and lower case)
                        if (ch == ch5[k]) {  //If matching,
                           vcount++;}  //Counting vowels
                    }    
                }
                for ( i = 0; i < token1.length(); i++) {  
                    char ch = token1.charAt(i);
                    for (int p = 0; p < ch6.length; p++) {  //Finding matching punctuations.
                        if (ch == ch6[p]) {  
                            pcount++;}  //Counting punctuations.
                    }    
                }     
            }  // end of while loop
            while (in2.hasNextLine()) {  // If an input file isn't empty, reading by each line
                token2 = in2.nextLine();  //Placing into the string token2.
                lcount++;    }  //Counting lines.
            
        System.out.println("Total words : " + wcount + "\nTotal lines : " + lcount + "\nTotal alphanumeric : " 
                    + acount + "\nTotal sentences : " + scount + "\nTotal vowels : " + vcount + "\nTotal punctions : " 
                    + pcount);  // Printing out on the screen.
        out.println("Total words : " + wcount + "\nTotal lines : " + lcount + "\nTotal alphanumeric : " 
                    + acount + "\nTotal sentences : " + scount + "\nTotal vowels : " + vcount + "\nTotal punctions : " 
                    + pcount);  //Printing out in the output.txt file
        in.close(); //Closing reading an input file
        out.close();  //Closing an output.txt file
        }
        catch (FileNotFoundException exception) {  //If a file is not existing, exception caught here.
                    System.out.println("File not found.");  //Printing the error messege on the screen
                    System.exit(1);}  //Exiting the program
        catch (NoSuchElementException exception) {  //If a file contents invalid, exception caught here
                    System.out.println("File contents invalid");
                    System.exit(-1);}
    }  //end of main
}  //end of class

