public class conti {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              
          continue; // Don't print the value 4 & continue the loop again
          
            }
            System.out.print(i);
          }
    }
}

// Output is : 0 1 2 3 5 6 7 8 9