import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Arithmetic Operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("Is num1 greater than num2? " + (num1 > num2));
        System.out.println("Is num1 less than num2? " + (num1 < num2));
        System.out.println("Are num1 and num2 equal? " + (num1 == num2)); // Intentional error: '=' instead of '=='

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("Is num1 greater than 0 AND num2 greater than 0? " + (num1 > 0 && num2 > 0));
        System.out.println("Is num1 greater than 0 OR num2 greater than 0? " + (num1 > 0 || num2 > 0));
        System.out.println("NOT (num1 > num2): " + !(num1 > num2));

        scanner.close();
    }
}

