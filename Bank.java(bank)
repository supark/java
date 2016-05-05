/*
purpose : This program creates an LinkedList with customer's information such as first name, last name, and balance. 
          This program maintains a list of records.  The program will prompt the user for a command, execute 
          the command, then prompt the user for another command.  The commands must be chosen from the following 
          possibilites:
          a   Show all records 
          r   Remove the current record
          f   Change the first name in the current record
          l   Change the last name in the current record
          n   Add a new record
          d   Add a deposit to the current record
          w   Make a withdrawal from the current record
          q   Quit
          s   Select a record from the record list to become the current record
          
          Since LinkedList is conceptually similar to array lists, allowing to add, remove, and replace elements at 
          any position.  I will be learned the efficiency of operations on LinkedList, and compare them with the 
          equivalent operations on Array Lists through this program.


Algorithm : 
    step 1: Start
    step 2: Declares instance variable
    step 3: Start main method
    step 4: Construct switch method for choice of menu
    step 5: Construct menu method to display for user's input
    step 6: Construct display method to show all records that should be sorted by last name
    step 7: Construct add method to add a new record
    step 8: Construct select method to become the current record
    step 9: Construct remove method to remove the current record
    step 10: Construct change first name method in the current record
    step 11: Construt change last name method in the current record
    step 12: Construct deposit method to add a deposit to the current record
    step 13: Construct withdraw method to make a withdrawal from the current record
    step 14: Stop

Data Structure : LinkedList

 */
package bank;

import java.util.*;


public class Bank {  //class bank
  
    //Initialize as static to use inside bank class
    public static int current;  //This is current position of LinkedList
    public static LinkedList<customer> l = new LinkedList();  //Initializing name of LinkedList
    public static Scanner console = new Scanner(System.in); //This is for input data from a user. 
    
    public static void main(String[] args) {  //begin of main
    
    char choice;  //This is for input of menu option
    
        while(true) {  //Perform list operations
            
            menu();  //calling menu method
            
            choice = console.next().charAt(0);  // This is to store the input data as an character type.
            choice = Character.toLowerCase(choice);  //Input will be converted an lowercase.
            
            switch(choice) {  //begin of swich
            
                //This is for display of LinkedList
                 case 'a':  
                    a();
                    break;
                //This is for add of linkedList
                 case 'n': 
                    n();
                    break;
                //This is for finding a position that user is looking for.
                 case 's' :   
                    s();
                    break;
                //This is for removing in the current position.
                 case 'r':
                    r(current);
                    break;
                //This is changing the first name in the current position.
                 case 'f':
                    f(current);
                    break;
                //This is changing the last name in the current position.
                 case 'l':
                    l(current);
                    break;
                //This is for depositing in the current position.
                 case 'd' :
                    d(current);
                    break;
                //This is for withdrawing in the current position.
                 case 'w' :
                    w(current);
                    break;
                //This is for finishing the program.
                 case 'q' :
                    return;
            }  //end of switch
        }    //end of while  
    }  //end of main
    public static void menu() {  //Displaying the choice of menu
        
    System.out.print("a   Show all records " + "\nr   Remove the current record" + 
            "\nf   Change the first name in the current record" + 
            "\nl   Change the last name in the current record" + "\nn   Add a new record" + 
            "\nd   Add a deposit to the current record" + "\nw   Make a withdrawal from the current record" + 
            "\nq   Quit" + "\ns   Select a record from the record list to become the current record" + 
            "\n\nEnter a command from the list above (q to quit): ");
    } //end of menu method
    
    public static void a() {  //Displaying the contents of each LinkedList
        
        //Declaring 2 objects of customer class
        customer c = new customer();
        customer c1 = new customer();
        
        //Sorting by lastname albabetically
        for (int i = 0; i <= l.size(); i++) {  //Every last name will be compared using nested for loop.
                for (int j = i+1; j < l.size(); j++) {
                    c=l.get(i);
                    c1 = l.get(j);
                        if(c.getlname().compareTo(c1.getlname()) > 0){  //compareTo method returns numbers
                            l.remove(j);                                
                            l.add(i, c1);
                        }   
                }   
            } //end of nested for loop
        
        //If LinkedList is empty, print out "No Records exist!!".
        if (l.isEmpty()) 
            System.out.println("\nNo Records exist!!\n");
        else {  //Showing all the contents of each LinkedList using while loop
            int i =0;
            System.out.println("\nFirst Name        Last Name       Current balance" + 
                    "\n\n-----------       -----------        -----------");
            while(i < l.size()) {     
                  System.out.print(l.get(i).getfname() + "            " + l.get(i).getlname() + "             ");
                  System.out.printf("$%.2f",l.get(i).getba());
                  System.out.println("\n");
                  i++;
            }
        }
    }  //end of a method
    
    public static void n() {
        
        System.out.print("Enter first name: ");
        String fn = console.next();
        System.out.print("\nEnter last name: ");
        String ln = console.next();
        System.out.print("\nEnter the balance amount: ");
        double bal = console.nextDouble();
        System.out.println();
        //Storing new input datas
        customer c = new customer(fn, ln, bal);
        l.add(c); 
        
        customer c1 = new customer();
        
        for (int i = 0; i <= l.size(); i++) {
                for (int j = i+1; j < l.size(); j++) {
                    c=l.get(i);
                    c1 = l.get(j);
                        if(c.getlname().compareTo(c1.getlname()) > 0){ 
                            l.remove(j);
                            l.add(i, c1);
                        }   
                }   
        }
       
        //Finding current position
        for (int index=0; index < l.size(); index++){
            if(fn.equals(l.get(index).getfname()) && ln.equals(l.get(index).getlname()))  { 
                System.out.print("Current record is : " + l.get(index).getfname() + " " + l.get(index).getlname());
                System.out.printf(" $%.2f",l.get(index).getba());
                System.out.println("\n");
                current = index;
            }
        }
    }  //end of n method
    
    public static void s() {
        
        System.out.print("Enter first name : ");
        String fir = console.next();
        System.out.print("\nEnter last name : ");
        String lan = console.next();
        System.out.println();
        int index;
        boolean spot = false;
            
            //Finding a position of selected a record.
            for (index=0; index < l.size(); index++){
                if(fir.equals(l.get(index).getfname()) && lan.equals(l.get(index).getlname()))  {
                    spot = true;
                    current = index;
                    System.out.println("Current record is : " + l.get(index).getfname() + " " + 
                    l.get(index).getlname() + "\n");
                }
            }
           //If selected a record does not match, prints out "No matching record found".
           if(!spot)
               System.out.println("No matching record found.\n");
    } //end of s method
    
    public static void l(int current) {
        
            //Changing the last name in the current method.
            System.out.print("Enter new last name: ");
            String la = console.next();
            System.out.println();
            customer c1 = new customer();
            c1=l.get(current);
            c1.setlname(la);
            l.remove(current);
            l.add(current, c1);
            System.out.println("Current record is : " + l.get(current).getfname() + " " + l.get(current).getlname() + "\n");
            
            customer c3 = new customer();
            customer c4 = new customer();
        for (int i = 0; i <= l.size(); i++) {
                for (int j = i+1; j < l.size(); j++) {
                    c3=l.get(i);
                    c4 = l.get(j);
                        if(c3.getlname().compareTo(c4.getlname()) > 0){ 
                            l.remove(j);
                            l.add(i, c4);
                        }   
                }   
        }
        
            //returning the current position.
            for (int index=0; index < l.size(); index++){
                if(la.equals(l.get(index).getlname()))  
                    current = index;
            }  //end of for loop
    }  //end of l method
    
    public static void r(int current) {
        
        //Deleting the LinkedList of current position.
        System.out.println("Deleted : " + l.get(current).getfname() + " " + l.get(current).getlname() + "\n");
        l.remove(current);
    } //end of r method
        
    public static void f(int current) {
        
            //Changing the first name in the current method.
            System.out.print("Enter new first name: ");
            String firs = console.next();
            System.out.println();
            customer c1 = new customer();
            c1=l.get(current);
            c1.setfname(firs);
            l.remove(current);
            l.add(current, c1);
            System.out.println("Current record is : " + l.get(current).getfname() + " " + l.get(current).getlname() + "\n");
    }  //end of f method
    
    public static void d(int current) {
        
        //Depositing in the current position.
        System.out.print("Enter the deposited amount : ");
        double di = console.nextDouble();
        System.out.println();
        customer c = new customer();
        c=l.get(current);
        
        c.setba(c.getba()+di);
        l.set(current, c);
        System.out.print("Current record is : " + c.getfname() + " " + c.getlname() + " with ");
        System.out.printf("%.2f", di);
        System.out.println(" added to deposit.\n");
    }  //end of d method
    
    public static void w(int current) {
        
        //Withdrawing in the current position.
        System.out.print("Enter the withdrawaled amount: ");
        double dw = console.nextDouble();
        System.out.println();
        customer c = new customer();
        c = l.get(current);
        c.setba(c.getba()-dw);
        if(c.getba() >= 0) {
            l.set(current, c);
            System.out.print("Current record is : " + c.getfname() + " " + c.getlname() + " with ");
            System.out.printf("%.2f", dw);
            System.out.println(" took out to withdraw.\n");
        }
        else  //If the balance will become minus, showing the message.
            System.out.println("Your balance will be minus\n");
    }  //end of w method
}  //end of bank class
