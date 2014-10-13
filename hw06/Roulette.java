//Cody Chen-Shao 
// CSE 2 Programming 
// October 20, 2014 
// The purpose of this program is to simulate a Roulette game 
// and see how much money they take away with 1000 simulations 



public class Roulette {
    public static void main (String [ ] args) {
        

int guess= (int)(Math.random()*38); 
// establish your guess value


double money=0; // keep track of money
int winCount=0; // keep track of how many times number matches guess
int loseCount=0; // keep track how many times number does not match guess 
int profit=0; // how much you win

//int counter1=0;  
//int counter=0; 
//int guessCount=0;   

for(int counter=0; counter<1000; counter++){
//repeat 1000 times 
int guessCount=0;   
//guessCount refresh every time 

for(int counter1=0; counter1<100; counter1++){
 // repeat 100 times   
   

int number=(int)(Math.random()*38); 
// generate a new random number each 100 times 

if(guess == number){ // see if number matches 
    guessCount++; // each time adds one each 100 time
    winCount++; // how many times you win each 100
    
}   
    //System.out.println("!!!!"+guessCount);
//counter1++;
}

//System.out.println("~"+guessCount);
 if(guessCount>=3){ // see how much you generate profit
    profit++; 
} 

//System.out.println("!!!!"+guessCount); 
if(guessCount==0){ // see how much you lose profit 
    loseCount++; 
} 
//System.out.println("!!!!"+loseCount); 
//counter++;
}

money=(winCount*36); // the amount of money you win
//System.out.println(winCount);

System.out.println("The number of times your number never comes up is " +loseCount); 
System.out.println("Your total winnings is " +money); 
System.out.println("The number of times you walked away with profit is " +profit); 
    
    }
}