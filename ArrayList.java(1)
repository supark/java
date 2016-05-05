/*

purpose : This program creates an ArrayList data structure that is similar to the ArrayList data Structure that exist in
          the java library.  It means I am going to create ArrayList manually without import the java library.
          Actually, Array lists are conceptually similar to linked lists, allowing to add and remove elements at any
          position.  I will be learned the efficiency of operations on array lists, and compare them with the 
          equivalent operations on linked lists through this program.

Algorithm : 
    step 1: Start
    step 2: Declares instance variable
    step 3: Construct default constructor
    step 4: Construct constructor along with int type
    step 5: Construct size method to return the number of elements in ArrayList
    step 6: Construct isEmpty method to checks whether ArrayList is empty or not
    step 7: Construct checkBounds method to check ArrayList's capacity
    step 8: Construct add method to add elements at the end of ArrayList
    step 9: Construct another add method to add a value at a given location of the ArrayList
    step 10: Construct get method to retrieve a element from a given location, then returning the element.
    step 11: Construt isIn method to check a particular element exists
    step 12: Construct find method to return the location of the first occurence of an element.
    step 13: Construct remove method to remove the first occurance of an element 
    step 14: Construct shuffler method to generate random numbers for mixing up the all cards
    step 15: Stop

Data Structure : ArrayList

 */
package AD;

import java.util.Random;  // this import is necessary to create random numbers.

public class ArrayList {  //Start ArrayList class
    //Precondition : declares instance variables.
    private int currentSize;
    private Object[] buffer;
    
    public ArrayList() { //Default constructor
        //Precondition
        int defalt_size = 10;   
        buffer = new Object[defalt_size];
        currentSize = 0;  
    } //end of default constructor
    public ArrayList(int n) {  //Constructor a ArrayList with cleared buffer and currentsize.
        buffer = new Object[n];
        currentSize = 0;
    } //end of constructor
    public int size() {  //This size method returns the number of elements that is currently in the ArrayList.
    return currentSize;
    } //end of size method
    public boolean isEmpty() {  //Checks whether this is empty or not.
        return (currentSize == 0);  //Return true when it is empty.
    } //end of isEmpty method
    private void checkBounds() {  //Grows the buffer if the currentSize equals the buffer's capacity
        Object[] newBuffer = new Object[2*buffer.length];  //Before inserting an element into a buffer 
        for (int i = 0; i < buffer.length; i++) 
            newBuffer[i] = buffer[i];  //The existing elements are copied into the new buffer.
        buffer = newBuffer;  //If implemented above for loop, reallocation again to use buffer.
    } //end of checkBounds method
    public void add (Object x) {  //This method adds elements at the end of the buffer
        if(size() == buffer.length)  //If currentsize is full, 
            checkBounds();  //go to checkBound method to increase buffer size
        //This is an O(1)operation.
        currentSize++;  
        buffer[currentSize - 1 ] = x; //Adding last location of buffer
    } //end of add method
    public void add(int index, Object x) {  //this method allows to add a value at a given location.
        if(index < 0 || index > currentSize) { //Check the location is a inside buffer location.
            System.out.println("Index " + index + " is an invalid index number to add" + "\n"); //Showing the message
            return;  
        } //end of if block
        if(size() == buffer.length)
            checkBounds();
        
        for (int i = currentSize; i > index; i--) //Adjusting different between an index number and buffer number
            buffer[i] = buffer[i-1];
        
        buffer[index] = x;  //Inserting a given location
        currentSize++;  //As doing insertion, increasing the buffer size
        System.out.println(x + " is added at the index number " + index + " of the cards." + "\n");  //Showing the message the value and the location.
    } //end of add method
    public Object get(int index) {  //This method retrieve a element from a given location, then returning the element.
        if(index < 0 || index > currentSize) //If a given location is out of buffer size,
            return null; //returning null.
        else //Otherwise, return a value.
         return buffer[index]; 
    } //end of get method
    public boolean isIn(Object ob) {  //This method checks a particular element exists
        if(find(ob) >= 0)  
            return true;  //If finding, return true.
        else 
            return false;  //If not finding, return false.
    } //end of isIn method
    
    public int find(Object n) {  //This method returns the location of the first occurence inside the buffer.
        for (int i = 0; i < currentSize; i++) { //Checking all buffer's value
            if(n.equals(buffer[i]))  //If the value is found,  
                return i;
        } //end of for loop
        
        return -1;  //If can not find it, returning -1.
     } // end of find method
    
    public void remove(Object n) {  //This method remove the first occurance of an element in the buffer.
        int pos = find(n);  //Implementing find method to get the location of Object 
        
        if(pos < 0)  //If the object is not found in buffer by the find method. Then, returning -1.   
            System.out.println(n + " is not able to removed." + "\n"); //If not finding, showing this message.
        
        currentSize--; //Reducing one size of buffer
        
        for (int i = pos; i < currentSize; i++) { //If found the location of the buffer, 
            buffer[i] = buffer[i+1];  //moving up the buffer's value one by one using for loop after removing the specific object.
        }
        System.out.println(n + " is removed from the cards" + "\n"); //Displaying the message
    } //end of remove method
    /*
    public void shuffler() { //This method creating random numbers to mix up the all cards
        int sh;  // This is for random numbers
        Object temp;  //This is to hold tempoarily
        Random rand = new Random(); // Generates random numbers
        for (int n = currentSize - 1; n > 0; n--) { ////for loop goes thru whole ArrayList
            sh = rand.nextInt(n + 1); 
            //simple swap
            temp = buffer[sh];
            buffer[sh] = buffer[n];
            buffer[n] = temp;
            
        }
    }*/
}//end of class
    

    



