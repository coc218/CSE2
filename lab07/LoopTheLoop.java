//Cody Chen-Shao 
// CSE 2 Programming 
// October 9, 2014 
// The purpose of this program is to print out the number of stars depending
// on the user input using while loops and break statements. 
import java.util.Scanner;
public class LoopTheLoop {
    public static void main (String [ ] args) {
    Scanner myScanner; 
    myScanner=new Scanner (System.in);
    
System.out.println("Enter an int between 1 and 15 - "); 

int counter=0; 
int nStars=myScanner.nextInt();


if(nStars>15||nStars<1){
    System.out.println("Your int was not in the range"); 
} 
return; 


while(true){
    
    
    for(int i=0; i<nStars; i++){
        if(i==0){
            
            for(int x=0; x<nStars; x++){
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        for(int j=0; j<=i; j++){
            System.out.print("*"); 
        }
        System.out.println(); 
        
    }
    
  


System.out.println("Enter y or Y to continue"); 
String letter=myScanner.next(); 
if(letter.equals ("y") ||letter.equals ("Y")){
    
}else{
    break; 
}

}



}
}

