// Cody Chen-Shao 
// September 11, 2014
// CSE 2 Java Programming 
// The purpose of this program is to that prompts the user to enter two digits, 
//the first giving the number of counts on a cyclometer and the second giving the 
//number of seconds during which the counts occurred, and then an then prints out
//the distance traveled and the average miles per hour
import java.util.Scanner; 
public class Bicycle {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        // Had to first declare and import the scanner in order to be 
        //used later in the problem 
        
        System.out.print("Enter the number of seconds "); 
        
        int nSeconds=myScanner.nextInt ( ); 
        
        System.out.print("Enter the number of counts "); 
        
        int nCounts=myScanner.nextInt ( ); 
        
        double distance; 
        double minutes; 
        double wheelDiamter=27.0, 
        PI=3.14159,
        feetPerMile=5280, 
        inchesPerFoot=12, 
        secondsPerMinute=60; 
        // Had to declare the variables to be used later in the problem 
        
    
    
    
        distance=(nCounts*wheelDiamter*PI); 
        distance/=inchesPerFoot*feetPerMile; // Gives distance in miles
        System.out.printf("The distance was %3.2f and took %3.2f minutes.", (int)(distance*100)/100.0, (int)(nSeconds/secondsPerMinute*100)/100.0);
        
        //Prints out and calculates the distance truncates the decimal 
        
        double temp = ((int)(distance / (nSeconds/secondsPerMinute/60)*100))/100.0;
        System.out.print("The average mph was " + temp +""); 
        // Used formula and truncated the decimals 
    }
}