/*
Purpose : testarray class contains main class to execute along with ArrayList and card class under package AD.  
          First of all, it is implemented card class to create 52 cards, then executed each method in ArrayList class. 
*/
package AD;
import java.util.Random; 
import java.util.concurrent.ThreadLocalRandom;
public class testarray { //Starting testarray class
        
    public static void main (String[] args) { //Starting main method
    
    //Constructs an object of type ArrayList to invoke a lot of methods inside ArrayList class.
    ArrayList m = new ArrayList(); 
    
    //Testing isEmpty method
    boolean found3 = m.isEmpty();
    if(found3 = true) //If isEmpty method returns true,
            System.out.println(" ArrayList is currently empty." + "\n"); //showing this message.
   
          for (int a = 1; a <= 4; a++) { //Starting nested loop to create 52 cards.  There are four types of shapes such as ♦♥♣♠
              for (int b = 1; b <= 13; b++) { //This is number from 1 to 13
                  card c1 = new card(a,b); //Each shpae and number will assign to card class, then storing c1
                  m.add(c1);    //Total 52 cards stores into ArrayList m
              } 
          } //end of nested loop   
          
          for (int i = 0; i < m.size(); i++) { //Printing out all the cards by for loop
              System.out.print(i+1 + " : "); //Since nested loop as above incrementing by one, displaying the cards in order.
              System.out.println(m.get(i).toString() + "\n"); 
          } // end of for loop
   
        //testing get method
        int g1 = 54;  //preconditon : finding 54th variable.
        Object objge = m.get(g1);  //Implementing get method
        if(objge == null) //If can't find it, this if statement executes.
            System.out.println(g1 + " is an invalid index number to get an element" + "\n");
        else 
            System.out.println("The index" + g1 + " is " + objge + "\n");
        
        //Testing get method with another parameter value
        int g = 5;
        Object objg = m.get(g);
        if(objg == null) 
            System.out.println(g + "is an invalid to get an element" + "\n");
        else  //If get method finds it, else statement executes.
            System.out.println("The index" + g + " is " + objg + "\n");
        
        //testing isIn method 
        String is1 = "♦ King"; //preconditon : finding ♦ King variable.
        boolean is = m.isIn(is1); //Since isIn method's return type is boolean, it initializes as a boolean type.
        if(is = true)
            System.out.println(is1 + " is found in the cards." + "\n");
        else
            System.out.println(is1 + " is not found in the cards." + "\n");
        
        //Testing isIn method again with another parameter value
        String st = "SpadesEight";  //I initinalized invalid variable to check that isIn method works correctly.
        Object is2 = st;
        boolean found2 = m.isIn(is2);
        if(found2 == true)
            System.out.println(is2 + " is found in the cards." + "\n");
        if(found2 == false)
            System.out.println(is2 + " is not found in the cards." + "\n");
        
        //testing find method
        int obfi = m.find(m.get(7)); 
        if(obfi >= 0)
            System.out.println(" The find method has found " + obfi + "\n");
        else
            System.out.println( " The find method has not found " + obfi + "\n");
       
        //testing add method with two parameters
        int adlc = 55;
        Object adls = "♦ Ace";
        m.add(adlc, adls);
        
        //Testing add method with another parameters
        int adl = 5;
        m.add(adl, adls);
        System.out.println("-----After adding------ " + "\n");
        for(int n = 0; n < m.size(); n++) {
            System.out.print(n+1 + " : ");
            System.out.println(m.get(n).toString() + "\n");
        }
        
        //testing size method
        int s = m.size();
        System.out.println("The number of cards are " + s + "\n");
        
        
        //testing remove method
        Object re = "♦ Ace";
        m.remove(re);
        System.out.println("------After removing------ " + "\n");
        for(int n = 0; n < m.size(); n++) { 
            System.out.print(n+1 + " : ");
            System.out.println(m.get(n).toString()+ "\n");
        }
       
       //m.shuffler(); // Calling shuffler method in ArrayList class
       Random rnd = ThreadLocalRandom.current();
        ArrayList m2 = new ArrayList();

        for(int n = 0; n <= m.size(); n++) {
            int c = (int)(Math.random() * m.size()); 
            m2.add(m.get(c));
            } 
        m=m2;

    System.out.println("-----After shuffling------");
    System.out.println();
         
          for (int i = 0; i < m.size(); i++) { //Displaying how the shuffling did.
              System.out.print(i+1 + " : ");
              System.out.println(m.get(i).toString() + "\n");
          } 
          
  } //end of main method
} //end of testarray class

