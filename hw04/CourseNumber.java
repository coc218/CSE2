// Cody Chen-Shao 
// CSE 2 Programming 
// September 21, 2014
// The purpose of this program is to read in a 6 digit number and make sure that it adheres
// to the description and prints out the semester and year 
//10 spring, 20 summer 1, 30 summer 2, and 40 fall 

import java.util.Scanner; 
public class CourseNumber { 
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        // import scanner
        System.out.println("Enter a six digit number giving the course number -"); 
        // prompt user to enter the cours number
        int num=myScanner.nextInt(); 
        if(num>=186510&&num<=201440){
           // first if statement to check if it is in range
           
           int semester=num % 100;
           //int year= ((num-semester)/100); 
           //System.out.print("year" +year+""); 
           
            if(semester==40){
                System.out.println("The course was offered in the fall semester of "+(num-40)/100+""); 
            } // check if the last two digits are equal to 40 
            else if(semester==30){
                System.out.println("The course was offered in the summer 2 semester of "+(num-30)/100+""); 
            } // check if last two digits equal to 30
            else if(semester==20){
                System.out.println("The course was offered in the summer 1 semester of "+(num-20)/100+""); 
            } // check if last two digits equat to 20
            else if(semester==10){
                System.out.println("The course was offered in the spring semester of "+(num-10)/100+""); 
            } // check if last two digits equal to 10
            
            else {
                System.out.println(semester+ " is not a legitimate semester"); 
            } // if they aren't any of the options listed above then say not a legitimate semester
        }else{
            System.out.println("The number was outside the range [186510,201440]"); 
            // if not in range output
        }
        
    }
    }
