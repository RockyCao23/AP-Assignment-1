import java.util.Scanner;
class Question1 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
 
        int total = 0;
        for (int n = 0; n < 1000; n++) {
            if ((n % 3 == 0) || (n % 5 == 0)) {
                total = total + n;
            }
            
        }System.out.print(total);
        
        
        
        
    }
}