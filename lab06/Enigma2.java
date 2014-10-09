import java.util.Scanner;
public class Enigma2{
  public static void main(String args [] ){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *  Runtime error line 9 you can't divide anything by 0
 *  Args supposed to come before square brackets which results
 *  in a run time error 
 *  By the compiler generating an ArithmeticExcption this prompts
 *  the user to know that is has something to do with a calculation
 */
