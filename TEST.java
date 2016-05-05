/*
Purpose : Generate 100 random integer numbers ranging from 1-99 then, store these numbers in a data structure of arrays.
          Display the data on the screen. Call the insert method from BSTree class the values into the tree starting from 
          the first element of arrays and go sequentially.  Then, calling the infix recursive method.
*/
package bstnode;

public class TEST { //begin of TEST class
    public static void main(String[] args) {  //main method
        
        int[] s = new int[100];  //creating arrays of integer type of 100 size.

        for(int i=0; i<100; i++)  //add the elements in to arrays
            s[i] = ((int) (Math.random() * 99) + 1);  // creating random numbers between 1 and 99.

        System.out.println("The random numbers ");
        
        for(int i=0; i<100; i++) //displaying 100 random numbers
            System.out.print(s[i]+" ");
        
        System.out.println();
        BSTree b = new BSTree(s[0]);  //inserting first element of arrays into tree

        for(int i=1; i<100; i++)  //get the elements from arrays and store it into a binary tree
            b.insert(s[i]);

        System.out.println("The inorder traversal numbers :");
        b.infix();  //calling the method to perfom the sorting via infix recursive method
    }  // end of main
}  //end of TEST class