// Cody Chen-Shao 
// Cyclometer Java Program 
// September 9, 2014
// CSE 2 Java Programming 
// The purpose of this program is to print the number of minutes for
// each trip, the number of counts, distance of each trip (miles), and
// print the distance for the two trips combined 
public class Cyclometer {
    public static void main (String [] args) {
        int secsTrip1=480; // this establishes the variable
        int secsTrip2=3220; // this establishes the variable and numerical amount
        int countsTrip1=1561; // this defines the variable and the amount
        int countsTrip2=9037; // this defines the varaible and the amount
        double wheelDiameter=27.0, 
        PI=3.14159, // this is a constant
        feetPerMile=5280, // this is a constant that is used later
        inchesPerFoot=12, // constant used later
        secondsPerMinute=60; // constant used later in formula 
        double distanceTrip1, distanceTrip2, totalDistance; 
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches 
        // (for each count, a rotation of the wheel travels
        // the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}
