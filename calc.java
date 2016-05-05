/*
purpose : 
I will write a program that parses infix expressions into following Tokens 
(1) Integer constants (a series of decimal digits).
(2) x(representing a value to be supplied later).
(3) Binary operators (+, -, *,/ and %).
(4) Parentheses
passes the infix expression to a function that returns the expression to postfix form, then passes it to a function 
which evaluates the postfix expression, returns an integer of calculation of user's input.


Algorithm : 
    step 1: Start
    step 2: Getting for an input strings
    step 3: Checking any errors
    step 4: if there is an error, the program terminates.  Otherwise, input goes to converting postfix method
    step 5: When input converted postfix expression, calculating the postfix expression.
    step 6: Returning the value of calculating result.
    step 7: Stop
    

Data Structure : stack

 */
package test;

import java.util.*;

public class calc { // begin the calc class
    
    public static String sPost = "";  //this string is for postfix result this string put as a global variable in order to
                                      //use outside the classes.  

   public static void main(String[] args){  //begin of main class
       
          System.out.print("Enter infix expression: "); //Asking to an user to get input
            Scanner scan = new Scanner(System.in);  
            String inputStr = scan.nextLine();  // storing input as an string variable
            inputStr = inputStr.replace(" ", "");  //eliminating all spaces
            
        checkingerror(inputStr);  //calling the checkingerror method with input
        //sToPostfix(inputStr);
       compute(sPost);  //calculating with postfix expression
       
}  // end of main
   
         public static void checkingerror(String inputStr) {  // begin of checkingerror method
             
            int lpa = 0, rpa = 0;  // These are for counting how many left and right parentheses
            
            for ( int i=0; i<inputStr.length() ; i++ ) {  //Going thru all strings
                
                int last = inputStr.length()-1;  // getting the last character's location
                
                char chlast = inputStr.charAt(last);  // The last character of the string
                char ch = inputStr.charAt(i);  //pointing current character's location
                char ch1 = inputStr.charAt(i+1);  // pointing right next's character
                
               if (((chlast == '+') || (chlast == '-') || (chlast == '*') || 
                  (chlast == '/') || (chlast == '%')) ) {  //checking last character is an operator
                   System.out.println("Error in expression!! No operator between operands.  Also last token must be an operand.");
                            System.exit(0);  //terminating the program
               }
              
               if (ch == '.') {  // If the input has an period,
                            //it will print out this message
                            System.out.println("Error in expression!! Cannot accept floating point numbers.");
                            System.exit(0);  
                }
               //If input has two times operator sequentially, it will print out this message. 
               else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                    if(ch1 == '+' || ch1 == '-' || ch1 == '*' || ch1 == '/' || ch1 == '%') {
                        System.out.println("Error in expression!!  The " + ch + " operator cannot be preceded by a " + 
                                ch1 + " operator");
                        System.exit(0);
                    }
                }
               //case of operator is between operand and left parentheses
               else if(Character.isDigit(ch) && ch1 == '(') { 
                   
                        System.out.println("Error in expression!! No operator between operand and left parentheses.");
                        System.exit(0);
                      
              }
               //case of unmatching parenthese
               /*else if (ch == '(') {
                    for (int j = 0; j < inputStr.length(); j++) {
                        if (inputStr.charAt(j) == '('){
                            lpa++;
                        }
                        else if (inputStr.charAt(j) == '('){
                            rpa++;
                        }
                        
                    }
                   if(!(lpa == rpa)){
                   
                    System.out.println("Error in expression!! No matching left parentheses for a right parentheses.");
                    System.exit(0);
                    
                    } 
                }*/
               else //If there is no errors, it goes converting to postfix expression method
                   
                   sToPostfix(inputStr);
                   break;
      } //end of for loop
            
         }   //   end of checkingerror method   
      
 // Convert infix to Postfix
 private static String sToPostfix (String sPre){
  
  Stack<String> stack = new Stack<String>(); // String stack
     
  int i;
  char cTmp;
  
  for (i = 0; i < sPre.length();){
    cTmp = sPre.charAt(i); // Get one character from string
   
    if (cTmp == '('){
        
        stack.push(String.valueOf(cTmp)); // since cTmp is character, I need to convert string
        System.out.println("String.valueOf " + stack);
        i++;
    }
    
    else if (cTmp == ')'){ // If cTmp is ')' then pop until cTmp is '('
            System.out.println("lastElement: " + stack.lastElement());
            while (stack.lastElement().equals("(") == false){
            sPost += stack.pop() + " ";
            }
        stack.pop();
        i++;
    }
    
   else if (bIsOper (cTmp) == true){ // If cTmp is operator
        while (!stack.empty() && iGetPrec (stack.lastElement().charAt(0)) >= iGetPrec (cTmp)){ 
// Pop while precedence of stack was higher than cTmp
        sPost += stack.pop() + " ";
        }
    stack.push(String.valueOf(cTmp));
        //System.out.println("current stack: " + stack);
    i++;
   }
   
   else if (cTmp >= '0' && cTmp <= '9' || cTmp == 'x'){ // If cTmp is number or x
        do{ // While cTmp is number
            sPost += String.valueOf(cTmp);
            //System.out.println("i: " + i);
            if (++i >= sPre.length())
                break;
            //System.out.println("i: " + i);
            //System.out.println("cTmp : " + cTmp);
            //System.out.println("sPre.charAt(i): " + sPre.charAt(i));
            cTmp = sPre.charAt(i);  //to go to next character
            
        }while (cTmp >= '0' && cTmp <= '9' || cTmp == 'x');
    sPost += " ";
   }
   
   else // Ignore the other character
    i++; 
  } // end of for loop 
  
  while (!stack.empty()){ // Pop while stack is not empty
      System.out.println("last stack : " + stack);
   sPost += stack.pop() + " ";
  }
     System.out.println("Converted expression : " + sPost);
     return sPost;
 } // end of postfix method
 
 // If cChar is operator then return true else return false
 private static boolean bIsOper (char cChar){
  return cChar == '*' || cChar == '/' || cChar == '+' || cChar == '-' || cChar == '%';
 }
 
 // Return precedence of cOp
private static int iGetPrec (char cOp){ 
  switch (cOp){
   case '(':
    return 0;
   case '+':
    return 1;
   case '-':
    return 1;
   case '*':
    return 2;   
   case '/':
    return 2;
    case '%':
    return 2;
   default:
    return 3;
  } // end of switch
}

 // Calculate
public static String compute(String input) {
    //boolean qu = false;
    while(true) {
    System.out.print("Enter value of x : ");
    Scanner scan = new Scanner(System.in);
    char xnum = scan.next().charAt(0);  //the input probabaly is one decimal digit so I made charAt(0) to get just one digit
    String input2 = null;
    int i;
    
     for (i = 0; i < input.length(); i++){
         char cha = input.charAt(i);
         //System.out.println("input2: " + input2);
        if(cha == 'x')
         input2 = input.replace(cha, xnum);
     }
        
//Process the list into an ArrayList
        ArrayList<String> processedList = new ArrayList<String>();
        if (!input2.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input2);
            System.out.println("파싱할 문자열 수 : " + st.countTokens() + "개");
            while (st.hasMoreTokens()) { //checking whether there is more tokens or not
                processedList.add(st.nextToken());
            }
        } 
        else 
            return "Error";
        
//A Stack, we will use this for the calculation
        Stack<String> tempList = new Stack<String>();
//Iterate over the whole processed list
        Iterator<String> iter = processedList.iterator();
        while (iter.hasNext()) {
            String temp = iter.next();
            if (temp.matches("[0-9]*")) {
//If the current item is a number (aka operand), push it onto the stack
                tempList.push(temp);
            } 
            else if (temp.matches("[*-/+%]")) {
//If the current item is an operator we pop off the last two elements 
//of our stack and calculate them using the operator we are looking at. 
//Push the result onto the stack. 
                if (temp.equals("*")) {
                    int rs = Integer.parseInt(tempList.pop());
                    int ls = Integer.parseInt(tempList.pop());
                    int result = ls * rs;
                    tempList.push("" + result);
                } 
                else if (temp.equals("-")) {
                    int rs = Integer.parseInt(tempList.pop());
                    int ls = Integer.parseInt(tempList.pop());
                    int result = ls - rs;
                    tempList.push("" + result);
                } 
                else if (temp.equals("/")) {
                    int rs = Integer.parseInt(tempList.pop());
                    int ls = Integer.parseInt(tempList.pop());
                    int result = ls / rs;
                    tempList.push("" + result);
                } 
                else if (temp.equals("%")) {
                    int rs = Integer.parseInt(tempList.pop());
                    int ls = Integer.parseInt(tempList.pop());
                    int result = ls % rs;
                    tempList.push("" + result);
                }
                else if (temp.equals("+")) {
                    int rs = Integer.parseInt(tempList.pop());
                    int ls = Integer.parseInt(tempList.pop());
                    int result = ls + rs;
                    tempList.push("" + result);
                }
            } 
            else
                return "error";
        }  
//Return the last element on the Stack.
System.out.println("Answer to expression : " + tempList.pop());
    } // end of while
 } // end of calculating with postfix expression
} // end of class

