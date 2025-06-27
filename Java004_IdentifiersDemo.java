public class Java004_IdentifiersDemo {
    public static void main(String[] args) {

        // Valid Identifiers
        int age = 25;
        double $salary = 50000.50;
        String _message = "Hello";
        int numberofStudents = 30;

        // Invalid Identifiers
        // int 2times = 2;             Error: Starts with number
        // double my-score = 90;       Error: Contains hyphen
        // String class = "OOP";       Error: Reserved

        // Invalid Identifiers are commented to avoid errors in the code

        System.out.println("Valid Identifiers:");
        System.out.println("age: " + age);
        System.out.println("$salary: " + $salary);
        System.out.println("_message: " + _message);
        System.out.println("numberofStudents: " + numberofStudents);
    }
}
