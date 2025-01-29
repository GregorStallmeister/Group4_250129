public class ArrayBasics {
    public static void main (String[] args) {

        double[] numbers1 = new double[10];

        for (int i = 0; i < 10; i++) {

            numbers1[i] = i+1;
        }

        for(double number : numbers1) {
            System.out.println(number);
        }

        double[] numbers = {1, 2, 3, 4, 10, 6, 7, 8, 9, 5};

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
