public class Java008_BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;      // Binary: 0101
        int b = 3;      // Binary: 0011

        System.out.println("a & b = " + (a & b));        // AND
        System.out.println("a | b = " + (a | b));        // OR
        System.out.println("a ^ b = " + (a ^ b));        // XOR
        System.out.println("~a = " + (~a));

        System.out.println("a << 1 = " + (a << 1));      // Left shift
        System.out.println("a >> 1 = " + (a >> 1));      // Signed right shift

        System.out.println("a >>> 1 = " + (a >>> 1));    // Unsigned right shift

        // Practical use: Checking if number is even

        int num = 8;
        System.out.println(num + " is even: " + ((num & 1) == 0));
    }
}
