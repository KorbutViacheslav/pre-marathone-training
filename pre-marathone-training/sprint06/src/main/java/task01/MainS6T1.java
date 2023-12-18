package task01;


import java.time.LocalDate;

public class MainS6T1 {
    public static void main(String[] args) {
        System.out.println(leapOrNo(isLeapYear(2024)));
    }

    public static boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.isLeapYear();
    }

    public static String leapOrNo(boolean boo) {
        return boo ? "Year is leap!" : "Year not leap!";
    }
}
