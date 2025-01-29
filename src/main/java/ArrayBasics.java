public class ArrayBasics {
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 10, 6, 7, 8, 9, 5};

        System.out.println(findLargestNumber(numbers));
    }

    public static int findLargestNumber (int[] numbers) {
        int largest = 0;

        for(int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }
}
