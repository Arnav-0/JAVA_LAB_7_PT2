public class FactorialException extends Exception {
    private int number;

    public FactorialException(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FactorialException: Factorial is not defined for the number " + number;
    }
}
