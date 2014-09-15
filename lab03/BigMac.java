// Cody Chen-Shao 
// CSE 2 Programming 
// September 10, 2014 
// Big Mac Java Program 
// The purpose of this program is to create a program that computes the cost
// of buying Big Macs. We will be using the Scanner class to find the cost
// per Big Mac and the percentage tax 
import java.util.Scanner; 
public class BigMac {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        
        int nBigMacs=myScanner.nextInt ( ); 
        
        System.out.print("Enter the cost per Big Mac as "+
        " a double (in the form xx.xx): "); 
        double bigMac$=myScanner.nextDouble ( ); 
        System.out.print("Enter the percent tax as a whole number (xx): "); 
        double taxRate=myScanner.nextDouble ( ); 
        taxRate/=100; // user enters percent, but I want proportion 
        
        double cost$; 
        int dollars; //whole dollar amount of cost dimes, pennies 
        // for storing digits to the right of the decimal point for the cost$
        cost$=nBigMacs*bigMac$*(1+taxRate); 
        // get the whole amount, dropping decimal fraction 
        dollars=(int)cost$; 
        // get dimes amount e.g. (int)(6.73*10)% -> 67% 10->7 
        // where the % (mod) operator returns the remained after the divion 
        // 583%100 -> 83, 27%5 ->2 
        int dimes; 
        int pennies; 
        dimes=(int) (cost$*100) %10;
        pennies=(int) (cost$*100) %10; 
        System.out.println("The total cost of " +nBigMacs
         +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +
         " sales tax of "+ (int) (taxRate*100) +"%, is $"+dollars+'.'+dimes+pennies);
    }
}