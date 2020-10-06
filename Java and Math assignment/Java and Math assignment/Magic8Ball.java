import java.util.Scanner;

public class Magic8Ball{
    
    
    public static void main (String[] args) {
        
String y;
        int x = (int) (Math.random()* 20);
        
Scanner scan = new Scanner(System.in);
System.out.print("Ask me any yes or no question... and I shall answer.");

y = scan.next();

if (x == 1) {
    System.out.print("Yes");
}if (x == 2) {
    System.out.print("No");
}if (x == 3) {
    System.out.print("Maybe");
}if (x == 4) {
    System.out.print("Cannot be answered");
}if (x == 5) {
    System.out.print("Wait and ask tomorrow");
}if (x == 6) {
    System.out.print("Ask a friend");
}if (x == 7) {
    System.out.print("Cannot say");
}if (x == 8) {
    System.out.print("100%");
}if (x == 9) {
    System.out.print("Never");
}if (x == 10) {
    System.out.print("Don't count on it.");
}if (x == 11) {
    System.out.print("It is decidedly so.");
}if (x == 12) {
    System.out.print("Without a doubt.");
}if (x == 13) {
    System.out.print("Very doubtful.");
}if (x == 14) {
    System.out.print("My sources say no.");
}if (x == 15) {
    System.out.print("Don't ask me");
}if (x == 16) {
    System.out.print("Only you know");
}if (x == 17) {
    System.out.print("Most likely.");
}if (x == 18) {
    System.out.print("Not likely");
}if (x == 19) {
    System.out.print("Sorry, no.");
}if (x == 20) {
    System.out.print("Flip a coin");
}


    }
}
