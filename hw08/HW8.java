// Cody Chen-Shao 
// October 23, 2014
// CSE 2 Programming
// The purpose of this program is to create a driver program 

import java.util.Scanner;
public class HW8 {
    public static void main(String[] arg) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");
    }
    
    public static char getInput(Scanner scan, String variable ) //set up method to accept scan, CC
    {
        
     
            
            char x=variable.charAt(0); //break apart the string into each char
            char y=variable.charAt(1); // break apart string into each char
         
             String user=scan.next(); // accept what the user equals 
            char z=user.charAt(0); // break apart what the user equals 
            
        if(user.length()==1){ // if they enter one char
            
             if(z==x) //test to see they equal the decomposed string C or c
             {
                return x; 
            
             }
             else if (z==y)
             {
                return y; 
        
            }
        } else { // if the length is not equal to one
            System.out.println("You should enter exactly one character - "); 
            return getInput(scan, variable); // go back into your method and rerun
        }
            // if the user entered a length of one but not either C or c
            System.out.println("You did not enter a character from the list 'Cc'; try again "); 
            return getInput(scan, variable); 
            // return back to the method
        
    
    }
    
    public static char getInput(Scanner scan, String letter, int number) //set up method to accept scan, YynN and 5
    {
        
    int counter=0; // set counter to 0
    String user=scan.next(); // acept user input
    
    while(!(user.length()==1)){ //if it is not exactly one character long
        
        System.out.println("You did not enter exactly one character "); 
        user= scan.next(); // accept user input
        counter++; //count up one for each time they don't enter 
        
    }
             char z=user.charAt(0); //user input
        
            char y1=letter.charAt(0); //decompose the string into each char
            char y2=letter.charAt(1); 
            char y3=letter.charAt(2); 
            char y4=letter.charAt(3); 
            
    while(z!=y1&& z!=y2&& z!=y3&& z!=y4 && counter<number){ //test to see if they equal and if the counter is less than 5
    
        System.out.println("You did not enter a character from the list 'yYnN'; try again - "); // if not prompt user
        counter++; //keep track of how many times failed
        user=scan.next(); //accept user input
        z=user.charAt(0); //user input decompose
    }
    
    if(counter==number){ //when the counter equals hwo many times they failed out
        System.out.println("You failed after 5 times"); 
        user=" "; // if statement in main method
        z=user.charAt(0); 
        return z; //return user input
    }
    
    return z; // return user input

    }
    
    public static char getInput(Scanner scan, String a, String b){ // method to see different strings
        System.out.println("Choose a digit"); // prompt them each time
        System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- "); 
        
        char x1= b.charAt(0); //break down the string into each char
        char x2= b.charAt(1); 
        char x3= b.charAt(2); 
        char x4= b.charAt(3); 
        char x5= b.charAt(4); 
        char x6= b.charAt(5); 
        char x7= b.charAt(6); 
        char x8= b.charAt(7); 
        char x9= b.charAt(8); 
        char x10= b.charAt(9); 
        
        
        String user=scan.next(); //accept input
            
        char z=user.charAt(0); //break down input
        
        if(user.length()==1){ //test to see if the length of the character = 1
            if(x1==z){ // test to see if the user input matches one of the characters 
                return x1; 
            } else if(x2==z) {
                return x2; 
            } else if(x3==z) {
                return x3; 
            } else if(x4==z) {
                return x4; 
            } else if(x5==z) {
                return x5; 
            } else if(x6==z) {
                return x6; 
            } else if(x7==z) {
                return x7; 
            } else if(x8==z) {
                return x8; 
            } else if(x9==z) {
                return x9; 
            } else if(x10==z) {
                return x10; 
            } else {
                System.out.println("You did not enter either 0,1,2,3,4,5,6,7,8,9 "); //if they did not enter one of the choices
                return getInput(scan, a, b); // return back to method 
            }
        } else { // if user enters length more than one
            System.out.println("You entered more than one character try again "); 
            return getInput(scan, a, b); //return back to the method 
        }
        
   
        
    }
        
    
}