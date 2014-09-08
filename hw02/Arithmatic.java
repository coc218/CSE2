// Cody Chen-Shao 
// CSE 2 Programming 
// September 5, 2014 
// The objective of this program is to practice maniputlating data 
// stored in variables, running simple calculations, and in printing 
// the numerical output generated 
// I want to compute the cost of the items bought including PA sales tax 6%
public class Arithmatic {
    public static void main (String args []) {
        int nSocks=3; //Number of pairs of socks 
        // Cost per pair of socks 
        // ('$' is part of the variable name) 
        double sockCost$=2.58; 
        
        int nGlasses=6; // Number of drinking glasses 
        // Cost per glass 
        double glassCost$=2.29; 
        
        int nEnvelopes=1; // Number of boxes of envelopes 
        // cost per box of envelopes 
        double envelopeCost$=3.25;
        
        double taxPercent=0.06; 
    
        double totalSockCost$=7.74;
        // total cost of socks before tax 
        
        double totalGlassesCost$=13.74;
        // total cost of glasses before tax 
        
        double totalEnvelopesCost$=3.25;
        //total cost of envelopes before tax 
        
        double totalSockCostTax$=8.20;
        double totalGlassesCostTax$=14.56;
        double totalEnvelopeCostTax$=3.45;
        double totalTaxCost$=1.48;
        
        
        
        System.out.println("The item being bought is socks");
        System.out.println("I bought 3 pairs of socks");
        System.out.println("The cost of each sock is $2.58"); 
        System.out.println("The sales tax for each sock is $ "+ 
            ((double)Math.round((sockCost$*taxPercent)*100)/(100.0))+""); 
        System.out.println("The total cost of socks is (with no tax) $ "+
            (nSocks*sockCost$)+""); 
            
        System.out.println("The item being bought is envelopes");
        System.out.println("I bought 1 envelope"); 
        System.out.println("The cost of the envelopes is $3.25"); 
        System.out.println("The sales tax for each envelope is $ "+
            ((double)Math.round((envelopeCost$*taxPercent)*100)/(100.0))+""); 
        System.out.println("The total cost of envelopes is (with no tax) $ "+
            (nEnvelopes*envelopeCost$)+"");
        
        System.out.println("The item being bought is glasses"); 
        System.out.println("I bought 6 drinking glasses"); 
        System.out.println("The cost of each drinking glass is $2.29"); 
        System.out.println("The sales tax for each glass is $ "+
            ((double)Math.round((glassCost$*taxPercent)*100)/(100.0))+"");
        System.out.println("The total cost of glasses is (with no tax) $ "+
            (nGlasses*glassCost$)+"");
        
        System.out.println("The total price for socks is $ "+
            (totalSockCostTax$)+""); 
        System.out.println("The total price for envelopes is $ "+
            (totalEnvelopeCostTax$)+"");
        System.out.println("The total price for glasses is $ "+
            (totalGlassesCostTax$)+"");
        
        System.out.println("The total cost of the purchase before tax is $ "+
            ((totalSockCost$)+(totalGlassesCost$)+(totalEnvelopesCost$))+"");
        System.out.println("The total sales tax is $ "+
            (totalTaxCost$)+"");
        System.out.println("The total cost of the purchase is $ "+
            (totalSockCostTax$+totalEnvelopeCostTax$+totalGlassesCostTax$)+"");
        
    }
}