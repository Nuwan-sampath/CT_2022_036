package Q2;


import javax.swing.JFrame;
import java.util.Scanner;

public class NameFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = scanner.next();
        System.out.print("Enter last name: ");
        String last = scanner.next();

        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setTitle(first + " " + last);
        frame.setVisible(true);
    }
}
