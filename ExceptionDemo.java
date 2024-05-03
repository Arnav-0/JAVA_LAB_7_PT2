import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (type 'exit' to quit):");
        while (true) {
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number < 0 || number > 15) {
                    throw new FactorialException(number);
                }
                System.out.println("Factorial of " + number + " is: " + calculator.factorial(number));
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input. Please provide integers only.");
            } catch (FactorialException e) {
                System.err.println(e.getMessage());
            }
        }

        scanner.close();
    }
}