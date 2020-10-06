import java.util.Scanner;

public class DistFormula{
    // formula for distance = Math.sqrt((x1 + x2)^2 + (y1 + y2)^2)
    //
   
    
    public static void main (String[] args) {
        
    Scanner scan = new Scanner(System.in);
    double x1,x2,y1,y2; 
    double distance;
    
   //user input
    System.out.println("Distance Calculator");
    System.out.println("------------------------");
    System.out.print("Enter the x coordinate of point 1: ");
    x1 = scan.nextDouble();
    System.out.print("Enter the y coordinate of point 1: ");
    y1 = scan.nextDouble();
    System.out.print("Enter the x coordinate of point 2: ");
    x2 = scan.nextDouble();
    System.out.print("Enter the y coordinate of point 2: ");
    y2 = scan.nextDouble();
    
    
    
    distance = Math.sqrt(Math.pow((x1 + x2),2) + Math.pow((y1 + y2),2));
    System.out.println("\nThe distance between the points is: " + distance);
    
   
    }
    
}

