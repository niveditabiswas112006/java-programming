class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping without third variable
        a = a + b;  // a now has sum of both numbers
        b = a - b;  // b gets original value of a
        a = a - b;  // a gets original value of b
        
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
} 
