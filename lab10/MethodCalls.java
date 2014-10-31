// Cody Chen-Shao 
// CSE 2 Java Programming
// October 29, 2014
// The purpose of this lab is to use methods to call other methods 

public class MethodCalls {
    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);
        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));
        c = join(a, b);
        System.out.println("Join " + a + " to " + b + " to get " + c);
        System.out.println("Join 87, 42, and 83 to get " + join(87, join(42, 83)));
        System.out.println("Join -9 and -90 to get " + join(-9, -90));
    }
    
    
    
    public static int addDigit(int x, int y){
    
      
        
        if(x>0){
        String number=""+y+""+x;  
        int num=Integer.parseInt(number); 
        return num; 
        
        } else if(x<0 && y>0) {
            x=(x)*(-1); 
            String number=""+y+""+x;  
        int num=Integer.parseInt(number); 
        return -num;  
            
        
        } else if(x>0 && y<0) {
            y=y*(-1); 
            String number=""+y+""+x;  
        int num=Integer.parseInt(number); 
        return -num; 
        } else {
            x=-x; 
            y=-y; 
            String number=""+y+""+x;  
        int num=Integer.parseInt(number); 
        return num; 
            
        }
        
 
    }
    
    
    public static int join(int x, int y){
        
        int input= addDigit(y,x);
        return input; 
         
    }
  
}
