// Cody Chen-Shao 
// September 19,2014 
// CSE 2 Programming 
//The purpose of this program is to prompt the user to enter an int that gives the 
//thousands of dollars of income and then writes out the amount of tax on the income.

import java.util.Scanner; 
public class IncomeTax {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        // import the Scanner and declare it 
        System.out.println("Enter an int giving the number of thousands - "); 
        
        if(myScanner.hasNextInt()){
            int incomeTax=myScanner.nextInt(); 
            // define the variable and initialize it for later use
            if(incomeTax<0){
                System.out.println("You did not enter an int > 0"); 
            }
            // first if statment to check if its a positive number 
            else if(incomeTax<20){
                System.out.println("The tax rate on $" +(incomeTax*1000)+" is 5.0% and the tax is $"+((incomeTax*1000)*0.05)+""); 
            }
            //else if to check if it is < 20
            else if(incomeTax>=20&&incomeTax<40){
                System.out.println("The tax rate on $" +(incomeTax*1000)+" is 7.0% and the tax is $"+((incomeTax*1000)*0.07)+""); 
            } // else if to check when it is both greater than or equal to 20 and less than 40
            else if(incomeTax>=40&&incomeTax<78){
                System.out.println("The tax rate on $" +(incomeTax*1000)+" is 12.0% and the tax is $"+((incomeTax*1000)*0.12)+""); 
            } // else if to check if it is greater than or equal to 40 and less than 78
            else if(incomeTax>=78){
                System.out.println("The tax rate on $" +(incomeTax*1000)+" is 14.0% and the tax rate is $"+(int)((incomeTax*1000)*0.14)+"");
            } // else if to to check when it is greater than or equal to 78
        
        }else{
            System.out.println("You did not enter an int"); 
        } // to see if it is not an integer 
        
    }
}
        
    

