/*
Purpose : An object of class card represents one of the 52 cards in a standard deck of playing cards.  
          Each card has a shape(♦♥♣♠) and a numbers from 1 to 13.
*/

package AD;

public class card {
    //Precondition
    int kind; //Declares card shpaes
    int num;  //Declares card numbers
    
    //Initialize card shapes as final specific int type(invariant), and these are should be static because of being 
    //accessible to default constructor. 
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
     
    card(){  //Default constructor, precondition
     this(SPADE, 1);
        }
    card(int kind, int num){ //Constructor a card with cleared kind and num.
        this.kind = kind;
        this.num = num;
    }
    public String toString() { //toString() method returns a textual representation of an object.
        //Declares local variables
        String kind = "";  
        String num = "";
        //variant
        switch(this.kind){  //Start kind switch block
        case 4 :  //When seeing 4, changing to ♦ 
            kind = "♦";
            break;
        case 3 :  //When seeing 3, changing to ♥
            kind = "♥";
            break;
        case 2 :  //When seeing 2, changing to ♣
            kind ="♣";
            break;
        case 1 :  //When seeing 1, changing to ♠
            kind = "♠";
            break;
        default:  //exit this switch block
        }  //end of kind switch block
        
        switch(this.num){  //Start number switch block
        case 1 :  //When seeing 1, changing to Ace
            num = "Ace";
            break;
        //Rest of cases will go through the same way to change the values.    
        case 2 :  
            num = "Two";
            break;  
        case 3 :
            num = "Three";
            break;
        case 4 :
            num = "Four";
            break;
        case 5 :
            num = "Five";
            break;
        case 6 :
            num = "Six";
            break;
        case 7 :
            num = "Seven";
            break;
        case 8 :
            num = "Eight";
            break;
        case 9 :
            num = "Nine";
            break;
        case 10 :
            num = "Ten";
            break;
        case 11 :
            num = "Jack";
            break;
        case 12 :
            num ="Queen";
            break;
        case 13 :
            num = "King";
            break;
        default:  //exit of num switch block     
        }  //end of num switch block
    return kind + " " +num;  //Returning the kind value, white space, and num value whenever this method is called.
    } //end of toString method
} //end of card class
