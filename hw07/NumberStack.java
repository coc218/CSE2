// Cody Chen-Shao 
// October 16, 2014
// CSE 2 Programming 
// The purpose of this program forces the user to enter an integer between 1 and 9, inclusive, and then 
//prints out displays that depend on the value entered

import java.util.Scanner;
public class NumberStack {
    public static void main(String args[]) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        System.out.println("Enter an int between 1 and 9 ");
        //prompt user what to enter 
        int number = myScanner.nextInt();
        // save number input into variable 
        if (number > 9 || number < 1) {
            System.out.println("You did not enter an int in the range");
        } // check to see if int
        int count = 1;
        int y = number;

        for (int digit = 1; digit <= number; digit++) {
        // for loop to come up with digit to print 
            for (int line = 1; line <= digit; line++) {
            // how many lines of each digit 


                System.out.println("");

                for (int space = 1; space <= y; space++) {
                    System.out.print(" ");
                } // centering the pyramid based on the number inputted


                for (int row = 0; row < count; row++) {
                // how many digits per each row 
                    System.out.print(digit);
                }

                for (int space = 1; space <= y; space++) {
                    System.out.print(" ");
                } // centering the pyramid 

            }


            System.out.println("");

            for (int space = 1; space <= y; space++) {
                System.out.print(" ");
            }// centering the dashes 

            for (int dash = 0; dash < count; dash++) {
            // dashes increment by 2 each time; odd number
                System.out.print("-");

            }

            for (int space = 1; space <= y; space++) {
                System.out.print(" ");
            }// centering dashes 

            count = count + 2;
            // increment count by 2 each time
            y = y - 1;
            // decrement y by 1 for spaces
        }


        count = 1;
        int digit = 1;
        int line = 1;
        int row = 0;
        int dash = 0;
        y = number;
        int space = 1;

        while (digit <= number) {
        // while loop to get digit
            line = 1;
        // reset line back to 1 every time you reenter loop
            while (line <= digit) {
        // while loop to get how many lines 
                System.out.println("");

                row = 0;
        // reset back to 0 each time you reenter 
                space = 1;

                while (space <= y) {
                    System.out.print(" ");
                    space++;
                } // centering the numbers 

                while (row < count) {

                    System.out.print(digit);
                    row++;
                // how many numbers to print out in each row
                }

                while (space <= y) {
                    System.out.print(" ");
                    space++;
                }// cenering the numbers 


                line++;
            }

            System.out.println("");

            space = 1;
            while (space <= y) {
                System.out.print(" ");
                space++;
            }// centering the dashes 

            dash = 0;

            while (dash < count) {
                System.out.print("-");

                dash++;
            } // odd number of dashes 

            while (space <= y) {
                System.out.print(" ");
                space++;
            } // centering the dashes 


            digit++;
            count = count + 2;
            // for the amount of dashes and numbers/row 
            y = y - 1;
        }   // counter used for centering the dashes 


        count = 1;
        digit = 1;
        line = 1;
        row = 0;
        dash = 0;
        y = number;
        space = 1;

        do {
        // outer loop to get digit 
            line = 1;
        // reset line back to 1 each time 
            do {
                System.out.println("");
                row = 0;

                space = 1;
                


                    do {

                        System.out.print(" ");
                        space++;
                    } while (space <= y);
                // spacing of digit 
                

                do {
                    System.out.print(digit);
                //print out how many digits per row
                    row++;
                } while (row < count);
                space = 1;
                
                    do {

                        System.out.print(" ");
                        space++;
                    } while (space <= y);
                    // centering the digits 
                


                line++;
            } while (line <= digit);

            System.out.println("");

            dash = 0;

            space = 1;
            
                do {

                    System.out.print(" ");
                    space++;
                } while (space <= y);
              //centering the dashes 
            do {

                System.out.print("-");
                // odd number of dashes 
                dash++;
            } while (dash < count);

            space = 1;
            
                // last block does not need a space so won't
                //enter the do while loop 
                do {

                    System.out.print(" ");
                    space++;
                } while (space <= y);
            
            digit++;
            count = count + 2;
            // counter goes up by 2 each time to compare
            y = y - 1;
            // y decrements each time for the number of spaces
        } while (digit <= number);

    }
}