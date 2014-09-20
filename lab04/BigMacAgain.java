// Cody Chen-Shao 
// CSE 2 Java Programming 
// September 17, 2014 
// The purpose of this program is to write a program that uses the Scanner class
//to obtain from users how many Big Macs they want and whether they want an order 
//of fries. It then prints out the total cost of the meal. 
//Big Macs still cost $2.22 each,  and an order of fries costs $2.15. 
import java.util.Scanner; 
public class BigMacAgain {
    public static void main (String [ ] args) {
        Scanner myScanner; 
        myScanner=new Scanner (System.in); 
        
        System.out.println("Enter the number of Big Macs"); 
        
        int nBigMacs;
        double total; 
        //declare variables 
        
       
        
        if(myScanner.hasNextInt()){
            
            int num=myScanner.nextInt();
            if(num>=0){
            //first test for a positive number 
            total=(double)Math.round(num*2.22);
            
            System.out.println("You ordered "+num+" for a cost of "+num+" x2.22= $ " +total+"");
            }
            else{
                System.out.println("You did not enter an int >0"); 
            }
            
        
        }else{
            System.out.println("You did not enter an int"); 
            return; // leaves the program or terminates 
            // if then statement to prompt the user what to prompt in and 
            //what happens if they do not enter the correct form of the number
        }
        
         int num=myScanner.nextInt(); 
        total=(double)Math.round(num*2.22); 
        // declare variables again to be used within the if else statement 
        
        System.out.println("You ordered " +num+ " for a cost of " +num+ " x2.22= $ " +total+ ""); 
            
        System.out.println("Do you want any french fries?"); 
        
        String frenchFries=myScanner.next();
        
        double fries$=2.15;
        // declaring and initializing the variables 
        
        // checking to see if the user inputs a Y, y, N, n
        // then totaling cost with french fry 
        if(frenchFries.equals("y")||frenchFries.equals("Y")){
        System.out.println("The cost of the fries is $2.15");
        System.out.println("The total cost of your meal is $ "+(total+fries$)+""); 
        }else if(frenchFries.equals("n")||frenchFries.equals("N")){
            
           System.out.println("The total cost of the meal is $ "+total+""); }
        else{
            System.out.println("You did not enter Y, N, y, n");
            return;
            // if not entered a Y,y,N,n then return the user back 
        }
            
    }
}
