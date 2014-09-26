//Cody Chen-Shao 
// CSE 2 Programming 
// September 24, 2014 
// The purpose of this program is to that uses the Scanner class to obtain from the user
//one of three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
//card from a deck of playing cards.

import java.util.Scanner; 
public class RandomGames {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        // import scanner 
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card-"); 
        // ask user to enter what game option they want 
        String letter=myScanner.next();
        
        
        if(letter.length()>1){
            System.out.println("single character expected"); 
            return; 
        } // check to see if user enters more than one letter
        
        switch (letter) {
            case "C": 
                System.out.println("Craps option not yet implemented"); 
                break; 
            //if user enters a C this is what will happen 
            case "c": 
                System.out.println("Craps option not yet implemented"); 
                break; 
            // if user enters a c this is what will happen 
            case "P": 
                System.out.println("Card option not yet implemented"); 
                break; 
            // if user enters a P this is what will happen 
            case "p": 
                System.out.println("Card option not yet implemented"); 
                break; 
            // if user enters a p this is what will happen 
            case "R": 
                
                int number=(int)((Math.random()*38)+1); 
                // implement random number generator with range 0 through 38
             
                
                
                if(number<37&&number>0){
                    System.out.println("Roulette "+number); 
                } // if number range 0-37 this will generate number 
                else {
                    System.out.println("Roulette 00"); 
                } // if number is 38 than it will be 00
               
                break; 
            
            case "r": 
                
             number=(int)((Math.random()*38)+1); 
            // implmement random number generator 
                 if(number<37&&number>0){
                    System.out.println("Roulette "+number); 
                } // range 0-37 print out number 
                else {
                    System.out.println("Roulette 00"); 
                } // if number is 38 then it will be 00
               
            
                break; 
                
            default: 
                System.out.println( letter+ " is not one of the R, r, C, c, P, p options"); 
                break; 
                
            // if user enters not an option above this is what will happen 
             
             
        }
        
        
        
    }    
}    