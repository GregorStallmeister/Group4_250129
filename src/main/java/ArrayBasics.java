public class ArrayBasics {
    public static void main (String[] args) {
        double[] numbers = {1, 2, 3, 4, 10, 6, 7, 8, 9, 5};

        System.out.println(findLargestNumber(numbers));
    }

    /**
     * Finds the largest number in an array of doubles and returns it
     * @param numbers - array of doubles
     * @return the largest number
     */
    public static double findLargestNumber (double[] numbers) {
        double largest = 0;

        for(double number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }
}
