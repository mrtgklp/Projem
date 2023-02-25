package learn.Example;

import java.time.LocalDateTime;
import java.time.Period;

public class LocalDate {
    public static void main(String[] args) {
        java.time.LocalDate date1 = java.time.LocalDate.of(1987,11,21);
        Period z = Period.between(date1, java.time.LocalDate.now());
        System.out.println("You lived for");
        System.out.println("Days " + z.getDays());
        System.out.println("Months " + z.getMonths());
        System.out.println("Years " + z.getYears());
    }
}
