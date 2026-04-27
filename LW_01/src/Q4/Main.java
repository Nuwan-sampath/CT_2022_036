package Q4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();


        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(today.format(format4));

    }
}