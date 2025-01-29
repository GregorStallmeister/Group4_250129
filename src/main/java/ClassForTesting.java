public class ClassForTesting {
    public static void main (String[] args) {
        System.out.println(add(23, 19));
    }

    public static int add (int a, int b) {
        return  a + b;
    }

    public static boolean isNumberEven (int number) {
        return number % 2 == 0;
    }

    public static  int multiply (int a, int b) {
        return  a * b;
    }

    public static String convertToUpperCase (String text) {
        return text.toUpperCase();
    }

    public static boolean isNumberPositive (int number) {
        return number >= 0;
    }
}
