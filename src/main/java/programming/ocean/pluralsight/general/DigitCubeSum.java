package programming.ocean.pluralsight.general;

/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 */
public class DigitCubeSum {
    private static final int input = 12340;

    public static void main(String... a) {
        DigitCubeSum objCubeSum = new DigitCubeSum();
        int sumOfCubes = objCubeSum.getSumOfCubes(input);
        System.out.println(sumOfCubes);
    }

    private int getSumOfCubes(int number) {
        int sumOfCubes = 0;
        while (number / 10 != 0 || number > 0) {
            int digit = number % 10;
            sumOfCubes += Math.pow(digit, 3);
            number = number / 10;
        }
        return sumOfCubes;
    }
}

