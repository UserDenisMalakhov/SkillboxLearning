package repeat;


import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main6Timestamp {
    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//        System.out.println(time);

        long start = System.currentTimeMillis();
        String line = "";
        for (int i = 0; i < 1000; i++){
            line += Math.random();
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();



        // преобразование timestamp в дату
        LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000,
                0, ZoneOffset.ofHours(3));
        System.out.println(now);
        System.out.println();

        // преобразование даты в timestamp
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1.toEpochSecond(ZoneOffset.ofHours(3)));

    }

}
