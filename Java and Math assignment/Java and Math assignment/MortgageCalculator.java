import java.util.Scanner;

public class MortgageCalculator{
    // formula for simple interest = A = P(1 + r)^n
   
   
    
    public static void main (String[] args) {
        
    Scanner scan = new Scanner(System.in);
    double a; 
    double p;
    double r;
    double n;
    
   //user input
    System.out.println("Investment Calculator");
    System.out.println("------------------------");
    System.out.print("Enter the investment's principle in dollars: ");
    p = scan.nextDouble();
    System.out.print("Enter the rate (%): ");
    r = scan.nextDouble();
    System.out.print("Enter the time in years: ");
    n = scan.nextDouble();
    //formula for simple interest = A = P(1 + r)^n
    
  
    a = (p * Math.pow((1 + (r/100)),n));
    System.out.println("\nThe investment will be worth: $" + a + " after " + n + " years.");
    
    
    
    
    }
    
}
