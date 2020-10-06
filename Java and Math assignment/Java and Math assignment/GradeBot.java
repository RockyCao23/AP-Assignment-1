import java.util.Scanner;

public class GradeBot{
    
    
    public static void main (String[] args) {
        
        
double x;
double y;

        
Scanner scan = new Scanner(System.in);

System.out.print("\nWhat was your test out of? ");

x = scan.nextDouble();

System.out.print("What was your score? ");

y = scan.nextDouble();

double z = ((y/x)*100);


if (z >= 86) {
    System.out.println("You got: " + z + "% \nLetter Grade:\tA\nFeedback:\tExcellent job!");
}else if ((z < 86) && (z >=73)) {
    System.out.println("You got: " + z + "% \nLetter Grade:\tB\nFeedback:\tGood Job!");
}else if ((z < 72) && (z >= 67)) {
    System.out.println("You got: " + z + "% \nLetter Grade:\tC+\nFeedback:\tGood try!");
}else if ((z < 67) && (z >= 60)) {
    System.out.println("You got: " + z + "% \nLetter Grade:\tC\nFeedback:\tYou can do better!");
}else if ((z < 59) && (z >=50)) {
    System.out.println("You got: " + z + "% \nLetter Grade:\tC-\nFeedback:\tMaybe next time!");
}else if ((z < 50) && (z >=0)) {
    System.out.println("You got: " + z + "% \nLetter Grade:\tF\nFeedback:\tWell..");
}

    }
}


