import java.util.Scanner;

class ArithmeticOperators {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.println("Choose any one option: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        
        int opt = scanner.nextInt();
        
        switch (opt) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            case 5:
                System.out.println("Result: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }

        scanner.close();
    } 
}