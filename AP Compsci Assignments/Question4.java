
class Question4 {
    
    public static void main(String[] args){
        
        int a = 1;
        int b = 1;
       
        while (a <= 1000) {
            a++;
            while (b <= 1000) {
                b++;
                double c = (Math.sqrt(a*a + b*b));
                if (a+b+c == 1000) {
                    System.out.println("A x B x C" + (a * b * c));
                }
            }
        }
    }
}
