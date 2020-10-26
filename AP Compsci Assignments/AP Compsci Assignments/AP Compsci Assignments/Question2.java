
class Question2 {
    
    public static void main(String[] args){
        
     
        
       
        int total = 0;
        
        int sum1 = 0;
        int w = 0;
        int sum = 0;
        
        int x = 0;
        int y = 1;
        int i = 1;
        for (int n = 0; n < 4000000; n = x + y) {
            
            i = x + y;
            y = x;
            x = i;
            if (i % 2 == 0){
                total = total + i;
            }
            
            
            
            
            
        }System.out.println(total);
        
    }
}
