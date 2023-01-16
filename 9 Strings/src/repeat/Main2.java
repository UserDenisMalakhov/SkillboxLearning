package repeat;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        Product soap = new Product("Soap", 150);
        String goods = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++){
            goods += soap + "\n";
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(goods.length());
        System.out.println();

        Product banana = new Product("Banana", 200);
        StringBuilder builder = new StringBuilder();
        long start1 = System.currentTimeMillis();
        String goods1 = "";
        for (int i = 0; i < 10_000; i++){
            builder.append(banana).append(goods1).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start1);
        System.out.println(goods1.length());
        System.out.println();



        String s1 = "Hello";
        String s2 = "Denis";
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++){
            s1.concat(s2);
        }
        System.out.println(System.currentTimeMillis() - start3);


    }
}
