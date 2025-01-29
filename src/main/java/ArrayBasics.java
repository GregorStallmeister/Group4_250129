public class ArrayBasics {
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 10, 6, 7, 8, 9, 5};

        System.out.println(findLargestNumber(numbers));
    }

    // method for calculating the sum of array elements
    public static Double sumOfArray(Double[] arr) {
        Double sum = 0.0;
        for(Double element: arr) {
            sum += element;
        }
        return sum;
    }

    // method for addition 2 arrays elementwise
    public static Double[] sumOfTwoArray(Double[] arrA, Double[] arrB) {
        if (arrA.length == arrB.length) {

            Double[] sum = new Double[arrA.length];
            for (int i = 0; i < arrA.length; i++) {
                sum[i] = arrA[i] +  arrB[i];
            }
            return sum;
        }
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
