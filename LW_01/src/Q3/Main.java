package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first, middle, and last name: ");
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        System.out.println(first + " " + middle.charAt(0) + ". " + last);
    }
}