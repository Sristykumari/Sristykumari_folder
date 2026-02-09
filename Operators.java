public class Operators {
    public static void main(String[] args) {
                System.out.println("Java Operators");

        // Assignment operator
      int i = 10;
      int j = 20;
      int k = i = 100;
      System.out.println("Value of i: " + i); // Outputs 100
      System.out.println("Value of j: " + j); // Outputs 20
      System.out.println("Value of k: " + k); // Outputs 100
      // Arithmetic operators (+, -, *, /, %)
      int sum = i + j;
      int difference = j - i;
      int product = i * j;
      int quotient = j / i;
      int remainder = j % i;
      System.out.println("Sum: " + sum);
      System.out.println("Difference: " + difference);
      System.out.println("Product: " + product);
      System.out.println("Quotient: " + quotient);
      System.out.println("Remainder: " + remainder);
      
    }
}
