import java.util.Scanner;

public class InputGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get the operator from the user
        System.out.print("Enter the operator: ");
        String operator = scanner.next();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Pass the input to the solver module
        MathProblemsSolver.solveMathProblems(num1, operator, num2);
    }
}