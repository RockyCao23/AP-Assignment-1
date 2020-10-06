import java.util.Scanner;

public class Secret{
    
    
    public static void main (String[] args) {
        
Scanner scan = new Scanner(System.in);

String x;


System.out.println("Welcome to the bank of Rocky \nPlease enter your 6 digit account number: \nEnter x to exit.");

do {
x = scan.next();

if ("123456".equals(x)) {
    System.out.println("Please enter your password: ");
     do{

    
x = scan.next();

if ("password" .equals(x)) {
System.out.println("Welcome to your chequing account. \n\nYour balance is $-56.78 \n\nPlease enter x to exit.");
}

else if ("x".equals(x)) {
System.out.println("Thank you! See you next time!");

}

else {
    System.out.print("Incorrect Password! Please try again.");
    

}
}while (!"x".equals(x));
    
    }
    else if("x".equals(x)) {
System.out.println("Thank you! See you next time!");
}


else if(!"123456".equals(x)) {
    System.out.println("This account does not exist, please try again");
    }
}while (!"x".equals(x));
        
}
}
