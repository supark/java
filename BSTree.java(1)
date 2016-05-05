/*

purpose : This is to gain experience with Binary Searh Tree and building my own LinkedList.  Each node has three 
          components, its value, pointer to left subtree and pointer to right subtree.  Generate 100 random integer 
          numbers ranging from 1-99 then, store these numbers in a data structure of arrays.
          Display the data on the screen. Build a self-defined LinkedList to create a Binary search tree.  Insert the 
          values into the tree starting from the first element of arrays and go sequentially.  Display the data from 
          Binary Search tree using an infix recursive method.

Algorithm : 
    step 1: Start
    step 2: Create own LinkedList
    step 3: Create tree
    step 4: Create insert method to insert items into the tree
    step 5: Create infix method to display inorder traversal of the tree data
    step 6: creating arrays of integer type of 100 size. 
    From main method
    step 7: Generate 100 random numbers to store into arrays
    step 8: Displaying 100 random numbers
    step 9: Elements from arrays store into a binary tree
    step 10: Displaying inorder traversal of the tree data
    step 11: Stop

Data Structure : Binary Tree

 */
package bstnode;

class node {  //class for node
        public node lt,rt;  //Declaration of left, right, and item of node
        public int item;

            public node(int data) {  //constructor
                lt = null;
                rt = null;
                item = data;
            }  
    }  //end of node class   

class BSTree {  //begin of BSTree class
        private node root;  //declares node root as private data type
    
            public BSTree() {  //constructor
                 root = null;
            }
            public BSTree(int n) {  ////Constructor with parameter
                root = new node(n);
            }  
            public void insert(int n)  {  //When insert method is called from main method, performing calling realinsert method
                root = realinsert(root,n);  //because there is no node inside main method and the root has item already.
                //it is because it should bring root's item together.
            }
            private node realinsert(node node, int value) {  //method to append the element to the tree
                if(node == null)  //If node is empty, insert the value
                    return new node(value);
                if(node.item <= value) //comparing values, then bigger value inserts to the right side
                    node.rt = realinsert(node.rt, value);
                else  //comparing values, then smaller value inserts to the left side
                    node.lt = realinsert(node.lt, value);
            return node;
            }
            public void infix() {  //When infix method is called from main method, performing calling realinfix method
                realinfix(root);  //because there is no node root inside main method
                System.out.println("");  //everything is done, the cursor will go to the next line
            }
            private void realinfix(node node) {  //inorder traversal of the tree data
                if(node != null) {
                    realinfix(node.lt); 
                    System.out.print(node.item+" ");
                    realinfix(node.rt);
                }
            }  //end of realinfix method
    }  //end of BSTree class

    
