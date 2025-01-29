public class ArrayBasics {
    public static void main (String[] args) {

        double[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] numbers2 = new double[10];

        for (int i = 0; i < 10; i++) {

            numbers2[i] = i+11;
        }

        System.out.print("Array numbers1: ");
        for(double number : numbers1) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Array numbers2: ");
        for(double number : numbers2) {
            System.out.print(number + " ");
        }


        System.out.println();
        System.out.println("Largest Number: " + findLargestNumber(numbers1));
        System.out.println("sumOfArry: " + sumOfArray(numbers2));
        System.out.print("sumOfTwoArrays: ");
        double[] result = sumOfTwoArrays(numbers1, numbers2);
        if (result != null) {
            for (double element : result) {
                System.out.print(element + " ");
            }
        }
    }


    // method for calculating the sum of array elements
    public static double sumOfArray(double[] arr) {
        double sum = 0.0;
        for(double element: arr) {
            sum += element;
        }
        return sum;
    }

    // method for addition 2 arrays elementwise
    public static double[] sumOfTwoArrays(double[] arrA, double[] arrB) {
        if (arrA.length == arrB.length) {

            double[] sum = new double[arrA.length];
            for (int i = 0; i < arrA.length; i++) {
                sum[i] = arrA[i] +  arrB[i];
            }
            return sum;
        }
        return null;
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
