import java.util.Scanner;
public class Triangle{
    public static void main (String[] args) {
        
Scanner scan = new Scanner(System.in);

//What character do you want your bar made of?
// * How long do you want your bar? 7 
String x;
System.out.println("What character do you want your triangle made of?");
x = scan.next();
System.out.println("How tall do you want your triangle?");
int y = scan.nextInt();
for (int w = 1; w <= y; w++){
    for (int t = 1; t <= w; t++){
 System.out.print(x);   }
 System.out.println("\n");
}



    }
}

