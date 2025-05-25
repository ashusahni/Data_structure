import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    String name = Scanner.next();
        System.out.print("Enter a word: ");
        String word = scanner.nextLine(); // Reads one word
        System.out.println("You entered: " + word);

        scanner.close();
    }
}
