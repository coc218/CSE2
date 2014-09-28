// Cody Chen-Shao 
// CSE 2 Java Programming 
// September 25, 2014
// The purpose of this program is to that prompts the user
//to enter a choice of a burger, a soda, or fries. Then the program prompts the users for
//details of their choices


import java.util.Scanner; 
public class BurgerKing {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        // import Scanner 
        System.out.println("Enter a letter to indicated a choice of Burger (b or B)"
        +"Fries (F or f) or Soda (S or s)");
        // ask user what they want to order 
        String letter=myScanner.next(); 
        //declare and intialize the variable 
        if(letter.length()>1){
            System.out.println("Single character expected"); 
            return; 
        }
        // if input greater than one length than single character will happen 
        switch(letter){
            case "B": 
                System.out.println("Enter A or a for 'all the fixins' C or c for cheese"
                + " N or n for none of the above"); 
                //prompt user for what they want if inputed B
                    letter=myScanner.next();
                // initialize variable 
                    if(letter.equals("A")||letter.equals("a")){
                        System.out.println("You ordered a burger with all the fixins"); 
                    }
                    // what happens if they input A or a
                    else if(letter.equals("C")||letter.equals("c")){
                        System.out.println("You ordered a burger with cheese");
                    }
                    //what happens if they input c or C
                    else if(letter.equals("n")||letter.equals("N")){
                        System.out.println("You ordered a burger with none of the above");
                    }
                    //what happens if they input n or N
                    else {
                        System.out.println("You did not enter a correct option"); 
                    }
                    // what happens if they don't enter either of the options for above
                    break; 
                    
                    
            case "b":
                // same thing happens for "B" case 
                 System.out.println("Enter A or a for 'all the fixins' C or c for cheese"
                +"N or n for none of the above"); 
                
                    letter=myScanner.next();
                
                    if(letter.equals("A")||letter.equals("a")){
                        System.out.println("You ordered a burger with all the fixins"); 
                    }
                    
                    else if(letter.equals("C")||letter.equals("c")){
                        System.out.println("You ordered a burger with cheese");
                    }
                    
                    else if(letter.equals("n")||letter.equals("N")){
                        System.out.println("You ordered a burger with none of the above");
                    }
                    
                    else{
                        System.out.println("You did not enter a correct option"); 
                    }
                    
                    break; 
                    
                    
            case "F": 
                
                System.out.println("Do you want a large or small order of fries (l,L,s, or S)- "); 
                // ask user what type of fries they want 
                    letter=myScanner.next(); 
                    
                    if(letter.equals("l")||letter.equals("L")){
                        System.out.println("You ordered large fries"); 
                    }
                    // if they input l or L
                    else if(letter.equals("s")||letter.equals("S")){
                        System.out.println("You ordered small fries");
                    }
                    // if they input s or S
                
                    else {
                        System.out.println("You did not enter a correct option"); 
                    } // what happens if they don't input any of the above 
                    
                    break; 
                    
                    
            case "f": 
                // same thing happens for F
                System.out.println("Do you want a large or small order of fries (l,L,s, or S)- "); 
                
                    letter=myScanner.next(); 
                    
                    if(letter.equals("l")||letter.equals("L")){
                        System.out.println("You ordered large fries"); 
                    }
                    
                    else if(letter.equals("s")||letter.equals("S")){
                        System.out.println("You ordered small fries");
                    }
                    
                    else {
                        System.out.println("You did not enter a correct option"); 
                    }
                    
                    break; 
                
                
                
                
            case "S": 
                
                System.out.println("Do you want Pepsi (p or P), Coke (c or C)," 
                + " Sprite (s or S) or Mountain Dew (M or m)- "); 
                // prompts what type of soda they would want 
                letter=myScanner.next(); 
                // initliaze variable 
                if(letter.equals("p")||letter.equals("P")){
                    System.out.println("You ordered a Pepsi"); 
                }// what happens if they type in p or P
                else if(letter.equals("c")||letter.equals("C")){
                    System.out.println("You ordered a Coke"); 
                }// what happens if they type in C or c
                else if(letter.equals("s")||letter.equals("S")){
                    System.out.println("You ordered a Sprite"); 
                }// what happens if they type in S or s
                else if(letter.equals("m")||letter.equals("M")){
                    System.out.println("You ordered a Mountain Dew"); 
                } // what happens if they type in m or M
                else {
                    System.out.println("You did not input a correct order"); 
                }
                // what happens if they don't input any of the characters 
                break; 
                
                
            case "s": 
                // same thing that happens for S
                System.out.println("Do you want Pepsi (p or P), Coke (c or C)," 
                +"Sprite (s or S) or Mountain Dew (M or m)- "); 
                
                letter=myScanner.next(); 
                
                if(letter.equals("p")||letter.equals("P")){
                    System.out.println("You ordered a Pepsi"); 
                }
                else if(letter.equals("c")||letter.equals("C")){
                    System.out.println("You ordered a Coke"); 
                }
                else if(letter.equals("s")||letter.equals("S")){
                    System.out.println("You ordered a Sprite"); 
                }
                else if(letter.equals("m")||letter.equals("M")){
                    System.out.println("You ordered a Mountain Dew"); 
                }
                else {
                    System.out.println("You did not input a correct order"); 
                }
                
                break; 
                
            default: 
            
                // what happens if they don't enter in any of the choices above 
                System.out.println( letter+ " is not one of the B, b, S, s, F, or f options"); 
                break; 
                    
           
                
                }
       
       
    
    }
}