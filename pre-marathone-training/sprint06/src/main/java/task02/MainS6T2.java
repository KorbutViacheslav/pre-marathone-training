package task02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainS6T2 {
    public static void main(String[] args) {
        System.out.println(getDateAfterToday(1, 10, 12));
    }

    public static String getDateAfterToday(int y, int m, int d) {
        return LocalDate.now().plus(Period.of(y, m, d)).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
