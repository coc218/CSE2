/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String args [] ){
    int n=40,k=60;
    System.out.println(+n); 
    String out="";
    switch(k%14){
        
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          System.out.println(+n); 
          k-=7;
          System.out.println(+k); 
    }
    if(n*k%12< 12){
         System.out.println(+k); 
      n-=20;
      System.out.println(+n);
      out+=n;
      System.out.println(+n); 
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println(+n); 
       System.out.println(+k); 
    }
    else {
      n=45;
      out+=n+k;
       System.out.println(+k); 
      System.out.println(+n); 
    }
    switch(n+k){
      case 114: 
        n-=11;
        System.out.println(+n); 
        k-=3;
         System.out.println(+k); 
        break;
      case 97:
        n-=14;
        System.out.println(+n); 
        k-=2;
         System.out.println(+k); 
        break;
      case 98:
        n/=5;
        System.out.println(+n); 
        k/=9;
         System.out.println(+k); 
      default:
        n-=3;
        System.out.println(+n); 
        k-=5;
         System.out.println(+k); 
    }
     out+=1/n + 1/k;  
      System.out.println(+k); 
     System.out.println(+n); 
    System.out.println(out);
  }
}

/*
 * Error report:
 * Run time error args is supposed to come before square brackets
 * N becomes a 0 when you print it out which will cause a runtime error 
 * 
 * 
 */
