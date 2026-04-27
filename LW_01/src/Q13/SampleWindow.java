package Q13;
import javax.swing.JFrame;

public class SampleWindow {
    public static void main(String[] args) throws InterruptedException {
        JFrame myWindow = new JFrame();
        myWindow.setSize(500, 250);
        myWindow.setTitle("UOK");

        myWindow.setVisible(true);
        Thread.sleep(500);
        myWindow.setVisible(false);
        Thread.sleep(500);
        myWindow.setVisible(true);
    }
}