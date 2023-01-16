package repeat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DataTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println();

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println();

        LocalDate birthday = LocalDate.of(1996, 7, 30);
        //birthday.plusYears(27);
        System.out.println(birthday.plusYears(27));
        System.out.println();

        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowNY);



    }
}
