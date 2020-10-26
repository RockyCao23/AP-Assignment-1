
class Question3 {
    
    public static void main(String[] args){
        
        int sum = 0;
        int total = 0;
        int y = 0;
        int h = 0;
        for (int i = 0; i <= 100; i++){
            
            int x = (int) Math.pow(i,2);
           total = total + x;
           //System.out.println(x);
           
           sum = sum + i;
           //System.out.println(sum);
           y = (int) Math.pow(sum,2);
            
           h = y - total;
            
            
        }
        
        System.out.println(h);
        
        
    }
}
