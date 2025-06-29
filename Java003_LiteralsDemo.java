public class Java003_LiteralsDemo {
    public static void main(String[] args) {

        // Integer literals in different formats
        int decimal = 100;
        int octal = 0144;           // Starts with 0
        int hex = 0x64;             // Starts with 0x
        int binary = 0b1100100;     // Starts with 0b

        System.out.println("Decimal 100: " + decimal);
        System.out.println("Octal 0144: " + octal);
        System.out.println("Hexadecimal 0x64: " + hex);
        System.out.println("Binary 0b1100100: " + binary);

        // Floating point literals
        double scientific = 1.234e2;
        System.out.println("Scientific notation 1.234e2: " + scientific);

        // Character and String literals
        char letter = 'J';
        String greeting = "Hello Java!";
        System.out.println("Character: " + letter);
        System.out.println("String: " + greeting);

        // Escape sequences
        System.out.println("Newline: Hello\nWorld");
        System.out.println("Tab: Hello\tWorld");
        System.out.println("Backslash: C:\\Program Files\\Java");
        System.out.println("Double quote: \"Java\"");
    }
}