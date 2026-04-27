package Q6;
import javax.swing.JFrame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width: ");
        int w = scanner.nextInt();
        System.out.print("Enter Height: ");
        int h = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame();
        frame.setSize(w, h);
        frame.setTitle(title);
        frame.setVisible(true);
    }
}