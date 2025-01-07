class Calculator {
   Calculator() {
   }

   public static void main(String[] var0) {
      double var1 = 10.0;
      double var3 = 5.0;
      System.out.println("Addition: " + (var1 + var3));
      System.out.println("Subtraction: " + (var1 - var3));
      System.out.println("Multiplication: " + var1 * var3);
      if (var3 != 0.0) {
         System.out.println("Division: " + var1 / var3);
      } else {
         System.out.println("Cannot divide by zero");
      }

   }
}
