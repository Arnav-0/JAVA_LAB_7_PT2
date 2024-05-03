public class FactorialCalculator {
    public long factorial(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Factorial is not defined for numbers less than 0 or greater than 15.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}