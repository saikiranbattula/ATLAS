public class Java006_ArithmeticOperators {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;

        System.out.println("a + b: " + (a + b));           // Addition
        System.out.println("a - b: " + (a - b));           // Subtraction
        System.out.println("a * b: " + (a * b));           // Multiplication
        System.out.println("a / b: " + (a / b));           // Division
        System.out.println("a % b: " + (a % b));           // Modulus
        System.out.println("a++ = " + (a++));              // Post-increment
        System.out.println("++b = " + (++b));              // Pre-increment

        // Floating-point division
        double x = 15.0;
        double y = 4.0;
        System.out.println("x / y = " + (x / y));
    }
}
