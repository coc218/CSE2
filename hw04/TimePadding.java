// Cody Chen-Shao 
// CSE 2 Programming 
// September 21, 2014
// The purpose of this program is to Write a program that has
//the user enter an positive integer giving the number of seconds that
//have passed during the day and then displays the time in conventional form

import java.util.Scanner; 
public class TimePadding {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        // import scanner 
        System.out.println("Enter the time in seconds"); 
        // prompt user to enter the time in seconds
        int time=myScanner.nextInt(); 
        
        int hour=(int)(time/3600);
        int minutes=(int)((time % 3600)/(60)); 
        int seconds=(int)(time-(hour*3600)-(minutes*60)); 
        // declare your variables and then figure out your hours, minutes, seconds
        System.out.print("The time is "+hour+":");
        
        if(minutes<10){
            System.out.print("0"+minutes+":");
        }
        // pad the minutes if it is less than 10 with a 0 in front
        else{
            System.out.print(minutes +":"); 
        }
        
        if(seconds<10){
            System.out.print("0"+seconds+".");
        }
        // do the same thing for seconds 
        else{
            System.out.print(seconds +"."); 
        }
        
        
       
        
    }
}