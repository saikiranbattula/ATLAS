public class Java007_RegionalLogicalOperators {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicence = true;

        // Relational operators
        System.out.println("Age > 21: " + (age > 21));
        System.out.println("Age <= 30: " + (age <= 30));
        System.out.println("Age = 25: " + (age = 25));
        System.out.println("Age != 30: " + (age != 30));

        // Logical operators
        System.out.println("Can drive: " + (age >= 16 && hasLicence));
        System.out.println("Is teenager or senior: " + (age >= 13 && age <= 19 || age >= 65));
        System.out.println("Not eligible: " + !(age >= 18));

        // Short-circuit evaluation
        boolean result = (5 > 3) || (10/0 == 0);
        System.out.println("Short-circuit result: " + result);
    }
}
