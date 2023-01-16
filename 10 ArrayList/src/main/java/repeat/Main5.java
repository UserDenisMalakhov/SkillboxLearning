package repeat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("First deal");
        toDoList.add(1,"Second deal");
        toDoList.add(0,"Third deal");
        for (int i = 0; i < toDoList.size(); i++){
            System.out.println(toDoList.get(i));
        }

        System.out.println();

        for(String item : toDoList){
            System.out.println(item);
        }

        System.out.println();

        ArrayList<String> toDoList1 = new ArrayList<>(){{
            add("First deal");
            add("Second deal");
            add("Third deal");
        }};
        toDoList1.add("Forth deal");
        toDoList1.remove(0);
        System.out.println(toDoList1);
        System.out.println(toDoList1.get(1));
    }
}
