class Calculator {
    public static void main(String[] args) {
        // Sample calculations
        double num1 = 10;
        double num2 = 5;
        
        // Addition
        System.out.println("Addition: " + (num1 + num2));
        
        // Subtraction
        System.out.println("Subtraction: " + (num1 - num2));
        
        // Multiplication
        System.out.println("Multiplication: " + (num1 * num2));
        
        // Division
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
