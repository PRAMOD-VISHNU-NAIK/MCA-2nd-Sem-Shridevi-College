class MathUtils {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Access static methods without creating an instance of MathUtils
        int sum = MathUtils.add(10, 20);          // Output: 30
        int product = MathUtils.multiply(10, 20); // Output: 200
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
