import java.util.Scanner;
public class RunningTally{
    public static void main (String[] args) {
Scanner scan = new Scanner(System.in);

//double n = 0;
//n = scan.nextDouble();

//for (n =scan.nextDouble(); n > 0; n = n+n){
    //System.out.println(n); }

System.out.println("Please enter values to add, enter a negative value to exit");

int input = 0;
int total = 0;
while (input >= 0){
    System.out.print("Add ");
    input = scan.nextInt();
    if (input >= 0) {
    total = total + input;
}else break;
}
System.out.println(total);
//do {
//double x = scan.nextDouble();

//if (x > 0) {
    //System.out.println(x + x);
//}



       //}while (x < 0);
    }
}
