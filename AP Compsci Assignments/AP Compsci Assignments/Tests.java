
class Question4 {
    
    public static void main(String[] args){
        
        int a = 1;
        int b = 1;
        double c;
        while (a <= 1000) {
            a++;
            while (b <= 1000) {
                b++;
                c = (Math.sqrt(a*a + b*b));
                if (a+b+c == 1000) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println((a * b * c));
                }
            }
        }System.out.println("Hello jesus");
    }
}