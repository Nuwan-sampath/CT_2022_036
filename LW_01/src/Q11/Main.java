package Q11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");
    }
}