package repeat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<String> item = new ArrayList<>();
        Collections.sort(item); // сортрует список
        Collections.binarySearch(item, "something string");
    }
}
