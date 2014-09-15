// Cody Chen-Shao 
// September 12, 2014 
// CSE 2 Java Programming 
// The purpose of this program that prompts the user to enter a double
// and then prints out the first four digits to the righ tof the decimal 
// point. 
import java.util.Scanner; 
public class FourDigits {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        
        System.out.print("Enter a double and I'll display the four digits to the right of the decimal point - "); 
        
        double nNumber=myScanner.nextDouble ( ); 
        
        double number1; // define the variable 
        double number2; 
        int number3; //you want an int becuase you don't want the
        //trailing numbers 
        
        number1=((int)(nNumber)); //first get the number without any
        // of the trailing digits after the decimal
        
        number2=((int)(nNumber*10000)); //convert decimal to 
        // an integer 
        
        number3=(int)(number2-(number1*10000));
        // subtract the 2 to obtain the four digits 
        
        System.out.print("The four digits are " +number3+ ""); 
    }
}