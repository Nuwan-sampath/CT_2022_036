package Q5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        System.out.println(today.format(format5));
    }
}