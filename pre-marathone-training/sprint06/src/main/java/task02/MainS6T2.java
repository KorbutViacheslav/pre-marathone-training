package task02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainS6T2 {
    public static void main(String[] args) {

        System.out.println(getDateAfterToday(2023, 12, 19));
    }

    public static String getDateAfterToday(int y, int m, int d) {
        LocalDate localDate = LocalDate.of(y, m, d);
        LocalDate localDateNow = LocalDate.now();
        Period dif;
        if(ChronoUnit.DAYS.between(localDateNow,localDate)==0){
            return LocalDate.of(0,0,0).format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        if (ChronoUnit.DAYS.between(localDateNow,localDate)>0) {
            dif = Period.between(localDateNow, localDate);
        } else {
            dif = Period.between(localDate, localDateNow);
        }

        LocalDate result = LocalDate.of(dif.getYears(), dif.getMonths(), dif.getDays());
        return result.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
