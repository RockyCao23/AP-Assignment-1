class displayBox {
    
    
    
    public static void displayBox(int height, int width){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++){
                System.out.print("$");
                
            }System.out.print("\n");
        }
    }
    
    public static void main(String[] args) { 
        
        displayBox(5,2);
       
        
        
    }
}