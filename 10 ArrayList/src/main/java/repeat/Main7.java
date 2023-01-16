package repeat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main7 {
    public static void main(String[] args) {
        // Map - соответствие ключей и значений, ключи находятся в Set
        //HashMap<String, Integer> good2count = new HashMap<>(); // неотсортированный список
        TreeMap<String, Integer> good2count = new TreeMap<>(); // алфавитный порядок

//        good2count.get();
//        good2count.put();
//        good2count.remove();

        Scanner scanner = new Scanner(System.in);

        for (;;){
            String goodName = scanner.nextLine();

            if (goodName.equals("LIST")){
                printHashMap(good2count);
                continue;
            }

            int count = 1;
            if (good2count.containsKey(goodName)) {
                count = good2count.get(goodName) + 1;
            }
            good2count.put(goodName, count);

//            if (good2count.containsKey(goodName)){
//                good2count.put(goodName, good2count.get(goodName) + 1);
//            }else {
//                good2count.put(goodName, 1);
//            }
        }
    }

    private static void printHashMap(Map<String, Integer> map){
        for (String key : map.keySet()){
            System.out.println(key + " => " + map.get(key));
        }
    }
}
