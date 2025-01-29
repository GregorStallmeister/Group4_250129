import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine(); // Reads a line of text

        scanner.close();

        char[] charArray = text.toCharArray();
        for(char element : charArray) {
            System.out.println(element);
        }
    }
}
