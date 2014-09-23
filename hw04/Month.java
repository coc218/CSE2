// Cody Chen-Shao 
// September 20, 2014
// CSE 2 Programming 
// The purpose of this program is to prompt the user to enter an intger for the month 
// and then displays the number of days in the month

import java.util.Scanner; 
public class Month {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        // import scanner
        System.out.println("Enter an int giving the number of the month 1-12)-"); 
        // ask user to input the month 
        if(myScanner.hasNextInt()){
            int month=myScanner.nextInt(); 
            
            //System.out.println("month "+month);
            if(month<0){
                System.out.println("You did not enter an int >0"); 
            }
            // first check to see you entered a positive number
            else if(month>12){
                System.out.println("You did not enter a month within the range"); 
            } // then check to see if in range 
            
            else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                System.out.println("The month has 31 days");
            } // if pass all conditions then continue on to see what months have each day
            
            else if(month==4||month==6||month==9||month==11){
                System.out.println("The month has 30 days");
            }
            
            else if(month==2){
                // if user enters 2 then check for what year
                
                System.out.println("Enter an int giving the year");
            
                if(myScanner.hasNextInt()){
                int year=myScanner.nextInt(); 
                
                if(year % 4==0 && year % 100 !=0 || year % 400==0){
                    // formula to check if it is a leap year
                 System.out.println("The month has 29 days"); 
                 }
                 
                 }else{
                     System.out.println("The month has 28 days"); 
                 } // not a leap year 
                
            }
            
        }else{
            System.out.println("You did not enter an int"); 
        }
        // if not enter positive number then displays this
        
        
    }
}
