

public class D6{
    
    
    public static void main (String[] args) {
        
  
    int roll;
    int count;
    
   
    System.out.println("Random Dice Machine");
    System.out.println("------------------------");
    
    
    //loop
    
    for (count = 1; count <= 10; count++) {
    roll = (int) ((Math.random() * 6) + 1);
    System.out.println("Die roll " + count + ": " + roll);
}
    
    }
    
}
