package repeat;

import java.util.StringJoiner;

public class Substrings2 {
    public static void main(String[] args) {
        String name1 = "Dima";
        String name2 = "Sasha";
        String name3 = "Masha";

        System.out.println(name1 + " ," + name2 + " ," + name3);
        System.out.println();

        StringJoiner stringJoiner = new StringJoiner(" ,");
        stringJoiner.add(name1);
        stringJoiner.add(name2);
        stringJoiner.add(name3);
        System.out.println(stringJoiner);
        System.out.println();

        String list = String.join(" ,", name1, name2, name3);
        System.out.println(list);
    }
}
