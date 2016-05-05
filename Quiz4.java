package quiz4;

import java.util.Scanner;

public class Quiz4 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a String or type q to quit:");
            String testString = userInput.next();

            if(testString.equals("q")){
                break;
            }

            //Tests to see if the string is of the form a^n b^2n
            if (stringCheck(testString)) {
                System.out.println("Success\n");
            } else {
                System.out.println("Fail\n");
            }
        }
    }

    public static boolean stringCheck(String testString) {
        //Will throw a StringIndexOutOfBoundsException once the string becomes less than 3 characters hence the try catch block
        try {
            if(testString.charAt(0) == 'a' && testString.charAt(testString.length() - 1) == 'b' && testString.charAt(testString.length() - 2) == 'b') {

                //If the parameter is true then true is returned otherwise false is returned
                return (testString.equals("") || stringCheck(testString.substring(1, testString.length() - 2)));

            }else{
                return false;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            return(testString.equals(""));
        }
    }
}