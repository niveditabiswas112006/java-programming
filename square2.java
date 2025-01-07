 class Square {
     public static void main(String[] args) {
         int number = 5;  // the number to square
        
         // Calculate square using multiplication
         int square = number * number;
        
         // Display result
         System.out.println("Number: " + number);
         System.out.println("Square: " + square);
        
         // Alternative using Math.pow()
         double squareUsingPow = Math.pow(number, 2);
         System.out.println("Square using Math.pow(): " + squareUsingPow);
     }
 }
