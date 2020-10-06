import java.util.Scanner;

public class AreaToRadius{
    // formula for area of circle = A = pi r^2
    // r = Math.sqrt(A/pi)
   
    
    public static void main (String[] args) {
        
    Scanner scan = new Scanner(System.in);
    double areachoice; 
    double r;
    
   //user input
    System.out.println("Circle Radius Calculator");
    System.out.println("------------------------");
    System.out.println("Enter the circle's area:\n");
   
    areachoice = scan.nextDouble();
    
    //calculate for radius ~ r = Math.sqrt(Area/pi)
    
    r = Math.sqrt(areachoice/Math.PI);
    System.out.println("\nThe cirle's radius is: " + r);
    
    
    
    
    }
    
}

