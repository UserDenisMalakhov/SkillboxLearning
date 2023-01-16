package repeat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //просто список

        HashSet<String> words = new HashSet<>(); // неупорядоченный список
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Second");
        for (String word : words){
            System.out.println(word);
        }
        System.out.println();
        System.out.println(words.contains("Second"));
        System.out.println();

        TreeSet<String> words1 = new TreeSet<>(); // список в алфавитном порядке
        words1.add("Hi");
        words1.add("Bye");
        words1.add("Java");
        for (String word1 : words1){
            System.out.println(word1);
        }
    }
}
