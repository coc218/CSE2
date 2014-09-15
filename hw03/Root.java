// Cody Chen-Shao
// CSE 2 Java Programming
// September 11, 2014
// The purpose of this code is to prompt the user to enter a double 
//and then print out a crude estimate of the cube root of the number and 
//the value of this crude guess when cubed.
import java.util.Scanner; 
public class Root {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        //Have to first declare and import the scanner in order to be
        //used later in the program 
        
        System.out.print("Enter a double, and I will print its cube root - "); 
        
        int nNumber=myScanner.nextInt ( ); 
        
        double formula; // declare the variables to be used later
        //in the program 
        double formula1; 
       
        
        formula=(nNumber)/3; // first guesss
         
        formula=((formula*formula*formula+nNumber)/
        (3*formula*formula)); 
        // substitue each preceding guess with the last one 
        formula=((2*formula*formula*formula+nNumber)/
        (3*formula*formula)); 
        
        formula=((2*formula*formula*formula+nNumber)/
        (3*formula*formula)); 
        
        formula=((2*formula*formula*formula+nNumber)/
        (3*formula*formula)); 
        
    
        
     
        formula1=(formula*formula*formula); 
        
        // final formula to be used in calclulation 
        
        
        
        
        System.out.println("The cube root is " +formula+ " :"); 
        System.out.print(" " +formula+ " * " +formula+  " * " +formula+ "= "+formula1+ "");  
    }
}