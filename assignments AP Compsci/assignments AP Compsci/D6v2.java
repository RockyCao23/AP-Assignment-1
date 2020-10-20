import java.util.Scanner;
public class D6v2{
    
    
    public static void main (String[] args) {
        
  Scanner scan = new Scanner(System.in);
    int roll;
    int count;
    int x;
    int total = 0;
   
    System.out.println("Random Dice Machine");
    System.out.println("------------------------");
    
    
   
    x = scan.nextInt();
    for (count = 1; count <= x; count++) {
    roll = (int) ((Math.random() * 6) + 1);
    System.out.println("Die roll " + count + ": " + roll);
    total = total + roll;
    
}System.out.println("Sum is: " + total);
    
    }
    
}