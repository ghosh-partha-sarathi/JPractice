package programming.ocean.pluralsight.general;

/**
 * Create a class with a method which can calculate the sum of first n natural numbers
 * which are divisible by 3 or 5
 */
public class Sum35Divisible {
    private static final int input = 10;

    public static void main(String... a) {
        Sum35Divisible sum35DivisibleObj = new Sum35Divisible();
        int sumResult = sum35DivisibleObj.calculateSum(input);
        System.out.println(sumResult);
    }

    private int calculateSum(int number) {
        int sum = 0;
        for (int count = 3; count <= number; count++) {
            if (count % 3 == 0 || count % 5 == 0) {
                sum += count;
            }
        }
        return sum;
    }
}
