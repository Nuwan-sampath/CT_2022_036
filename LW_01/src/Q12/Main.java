package Q12;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");
        frame.setSize(300, 200);
        // setLocation(x, y) where x is pixels from left, y is pixels from top
        frame.setLocation(100, 50);
        frame.setVisible(true);
    }
}