// Cody Chen-Shao 
// CSE 2 Programming 
// September 27, 2014 
// program that has three boolean variables to each of which the value of true 
//or false is randomly assigned. Then, at random, combine the three variables 
//with random choices of && and || and stores the result.

import java.util.Scanner;
public class BoolaBoola {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        //import scanner to use for later 
        //Does false || true && false have the value true(t/T) or false(f/F)?
        
        int number=(int)((Math.random()*2)+1);
        int number1=(int)((Math.random()*2)+1);
        int number2=(int)((Math.random()*2)+1);
        int number3=(int)((Math.random()*2)+1);
        int number4=(int)((Math.random()*2)+1);
       // int number5=(int)((Math.random()*2)+1);
    
        
        // random number generator 
        String value= ""; 
        // initialize value for the string 
        if(number==1){ 
            value = "false"; // if number generator has 1 then return false
        } else {
            value = "true"; 
        } // if number generator returns 2 then return true 
            
        String value1= ""; 
        //initialie value for the string 
        if(number1==1){
            value1 = "||"; 
            // if number generator returns a 1 then return ||
        } else {
            value1 = "&&"; 
        } // if number generator returns a 2 then return &&
        
        //repeat process with each term in the statement 
        String value2= ""; 
         if(number2==1){
            value2 = "true"; 
        } else {
            value2 = "false "; 
        }
        
        String value3= ""; 
         if(number3==1){
            value3 = "||"; 
        } else {
            value3 = "&&"; 
        }
        
        String value4= ""; 
         if(number4==1){
            value4 = "true"; 
        } else {
            value4 = "false"; 
        }
        
        String value5= ""; 
        //if(number5==1){
         //   value5= "t"; 
        //} else {
        //    value5= "f"; 
        //}
         
        System.out.println("Does " + value  + value1  + value2  + value3 + value4
        + " have the same value true (t/T) or false (f/F)?"); 
        // ask user question based on randomize parts 
        
        String letter=myScanner.next(); 
        //assign variable so user can put in letter 
        
       
        switch(letter){
            case "T": 
                letter = "t"; 
                break; 
            case "F": 
                letter = "f"; 
                break; 
        } // to account for if user enter t or T 
        // account for if user enters F or f 
        
        if(value.equals("false")||value2.equals("false")||value4.equals("false")){
            value5="f"; 
        } else {
            value5= "t"; 
        } // if any of the values are false then the answer will always return false 
        
        if(letter.equals(value5)){
            System.out.println("Correct");
        } else { // if they enter a letter that is not shown then it will say wrong 
            System.out.println("Wrong Try Again");
        }
        
        // if user inputs something that is not t/f then it will return wrong 
        
        
        
        //if(number==1){ // if number generator returns a 1 then the answer is correct
          //  System.out.println("Correct"); 
    //    } else if(number==2) {
      //      System.out.println("Wrong try again"); 
         // if number generator returns a 2 then answer is wrong 
    //    }
      
                
            
            
                
    
        
        
    }
}    