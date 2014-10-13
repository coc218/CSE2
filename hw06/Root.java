//Cody Chen-Shao 
// CSE 2 Programming 
// October 20, 2014 
// The purpose of this program is to find the square root
// of a number using the bisection method 

import java.util.Scanner; // import Scanner for user input
public class Root{
    public static void main (String [ ] args){
    Scanner myScanner; 
    myScanner=new Scanner (System.in);
    
    
    
System.out.println("Enter a double that is greater than 0"); 
// prompt user question 
int x=myScanner.nextInt();
// store result in int x

double low=0; 
double high=1+x; 
double middle=(low+high)/2; 
// set the values that are going to be used in the while loop 

while((high-low)>0.0000001){
// test to see if high-low will be greater than 0.00000001 if greater enter loop
// if not greater than you will have answer
   
    middle=(low+high)/2; 
    // calculate middle every loop and compare with x
    
    
    if((middle*middle)>x){ // test statement to see what to replace each 
    // high low value with 
        high=middle; 
    } else {
        low=middle; 
    }
       
}   

    System.out.println("The square root is " +middle ); 
    // prints out the root after exit the loop 
    }
}