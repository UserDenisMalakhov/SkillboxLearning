package repeat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class equalsDate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        LocalDate date2 = LocalDate.now().minusDays(18);
        System.out.println(date2);
//        System.out.println(date1.isEqual(date2));
//        if (date1.isBefore(date2)){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
        System.out.println(date1.compareTo(date2));
        System.out.println(date1.until(date2, ChronoUnit.DAYS));
    }
}
