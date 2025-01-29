public class ArrayBasics {
    public static void main (String[] args) {
        double[] numbers = new double[10];

        for (int i = 0; i < 10; i++) {

            numbers[i] = i+1;
        }

        for(double number : numbers) {
            System.out.println(number);
        }
    }
}
