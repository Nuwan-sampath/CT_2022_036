package Q8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string with '!': ");
        String input = scanner.nextLine();

        int index = input.indexOf('!');
        System.out.println(input.substring(0, index).trim());
        System.out.println(input.substring(index + 1).trim());
    }
}
