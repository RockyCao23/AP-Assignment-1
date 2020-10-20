import java.util.Scanner;

public class GuessingGame{
    public static void main (String[] args) {
        
Scanner scan = new Scanner(System.in);

int inputCount = 0;
int guess = 0;
int age = 0;

System.out.println("Welcome to the Guessing Game! Try to guess my age!");
age = (int)(Math.random()*100);



while (guess != age){
    System.out.print("\nWhat is your guess? ");
    guess = scan.nextInt();
    inputCount ++;
    
    if (guess > age) {
     System.out.println("Over");
    }else if (guess < age) {
        System.out.println("Under"); 
        }
    
}System.out.println("You guessed it! It took you " + inputCount + " tries!");


System.out.println(age);







    }
}