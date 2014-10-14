//Cody Chen-Shao 
// CSE 2 Programming 
// October 20, 2014 
// The purpose of this program is to simulate a Roulette game 
// and see how much money they take away with 1000 simulations 



public class Roulette {
    public static void main (String [ ] args) {
        

int guess= (int)(Math.random()*38);
// generate guess number 



double money=0; // initialize and declare money
int winCount = 0; //initialize and declare your win count
int loseCount = 0; //initialize and declare your lose count
int profit = 0;  //initialize and declare your profit count
int counter1=0;  //initialize and declare your counter
int counter=0; //initialize and declare your count


while(counter<1000){ //enter 1000 loop
    counter1 = 0; //reset 100 loop back to 0 when entering 1000 loop

   int guessCount=0;
// reset guesscount each 1000 times
        while(counter1<100){ //100 loop 

            int number=(int)(Math.random()*38); 
            // generate random number
            if(guess == number){ 
             guessCount++; //increment guessCount
             winCount++;  //increment winCount
            }
            
            counter1++;
        }
    
    money=(winCount*36); //the money you obtain
    

    if(guessCount>=3){ // you walk away with profit
        profit++; 
    } 

    if(guessCount==0){ // you lose money
        loseCount++; 
    } 

counter++;
}

System.out.println("The number of times your number never comes up is " +loseCount); 
System.out.println("Your total winnings is " +money); 
System.out.println("The number of times you walked away with profit is " +profit);

 



    }
}