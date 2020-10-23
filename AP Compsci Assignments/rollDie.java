import java.util.Scanner;
class rollDie {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        
    int rolls;
    int count;
    int sides;
    
    
   
    System.out.println("Random Dice Machine");
    
     do {
    System.out.println("How many dice do you want to roll?");
        rolls = scan.nextInt();
    
    System.out.println("How many sides do these dice have?");
        sides = scan.nextInt();
    
    int x = 1;
    int total = 0;
    while (x <= rolls) {
    count = rollDie(sides);
    System.out.println("You rolled: " + count);
    total = total + count;
    x++;
    
}System.out.println("Total: " + total + "\n");

System.out.print("Again? [y/n]");

}while (scan.next().equals("y"));
    
    }public static int rollDie(int n) {
        return (int) ((Math.random() * n) + 1);
    }
        
        
}
   


    
