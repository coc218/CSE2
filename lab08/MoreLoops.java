// Cody Chen-Shao 
// October 15, 2014
// CSE 2 Programming
// The purpose of this lab is to write loops and subsitutute them
// with different kinds of loops 

import java.util.Scanner;
public class MoreLoops {
  public static void main(String[] arg) {
    Scanner scan = new Scanner(System.in);

    int n = 0;
    // System.out.print("Enter an int-  ");

    //   while (!scan.hasNextInt()) {
    //   scan.next(); //get rid of the junk entered by user
    //  System.out.print("You did not enter an int; try again-  ");
    //}
    // int n=0; 

    do {
      System.out.println("Enter an int - ");

      while (!scan.hasNextInt()) {
        scan.next();
        System.out.print("You did not enter an int; try again-  ");
      }
    } while (!scan.hasNextInt());





    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO- WHILE LOOP

    //  n = scan.nextInt();
    //  for (int j = 0; j < n && j < 40; j++) {
    //    for (int k = 0; k < j + 1; k++) {
    //      System.out.print('*'); 
    //  }
    //    System.out.println(); 
    //    }

    n = scan.nextInt();

    int j = 0;

    while (j < n && j < 40) {
      int k = 0;

      while (k < j + 1) {
        System.out.print("*");
        k++;
      }
      System.out.println();
      j++;
    }
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS

    //        int k=4; 
    //do{
    //System.out.println("k="+k); 
    //k++; 
    //}
    //while(k<4); 
    //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP

    int k = 4;

    while (k < 4);
    System.out.println("k=" + k);

    //int count=0;
    //while(true){
    //switch(n){
    //default: System.out.println(n + " is > 5 or <1"); 
    //break; 
    //case 1:
    //case 2: System.out.print("Case 2 ");
    //continue; 
    //case 3: break;
    //case 4: System.out.println("Case 4");
    //case 5: System.out.println("Case 5");
    //break;
    //}
    //count++;
    //if(count>10)
    //break;
    //}


    for (int count = 0; count < 10; count++) {

      for (int count1 = 0; n == 1;) {
        System.out.print("Case 2");
      }

      for (int count2 = 0; n == 2;) {
        System.out.print("Case 2");
      }


      if (n == 3) {
        break;
      }
      if (n == 4) {
        System.out.println("Case 4");
      }
      if (n == 5) {
        System.out.println("Case 5");

      }
      else {
        System.out.println(n + " is >5 or <1");
      }
    }
    //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    // -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY


  }
}