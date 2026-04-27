package Q7;
import javax.swing.JFrame;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setTitle(time.format(formatter));
        frame.setVisible(true);
    }
}