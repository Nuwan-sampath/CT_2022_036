package Q10;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.charAt(word.length() / 2));
    }
}