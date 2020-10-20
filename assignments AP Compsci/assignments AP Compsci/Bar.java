import java.util.Scanner;
public class Bar{
    public static void main (String[] args) {
        
Scanner scan = new Scanner(System.in);

//What character do you want your bar made of?
// * How long do you want your bar? 7 
String x;
System.out.println("What character do you want your bar made of?");
x = scan.next();
System.out.println("How long do you want your bar?");
int y = scan.nextInt();
for (int w = 0; w < y; w++){
 System.out.print(x);   
}



    }
}
