package task02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainS6T2 {
    public static void main(String[] args) {
        LocalDateTime s = LocalDateTime.now();
        System.out.println(s.format(DateTimeFormatter.ISO_DATE));

    }

    public static LocalDate getDateAfterToday(int y, int m, int d) {
        //LocalDate localDate = LocalDate.now() + LocalDate.of(y, m, d);
        //localDate.format(DateTimeFormatter.ISO_DATE);
        return LocalDate.now();
    }
}
