public class MathProblemsSolver {
    public static void solveMathProblems(double num1, String operator, double num2) {
        // Solve and print some simple math problems
        switch(operator) {
            case "+":
                double sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case "-":
                double difference = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
                break;
            case "/":
                double quotient = num1 / num2;
                System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
                break;
            case "*":
                double product = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
                break;
            default:
                System.out.println("Invalid operator! Try: '+, -, * or /'");
        }
    }
}