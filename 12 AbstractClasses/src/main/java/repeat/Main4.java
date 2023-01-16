package repeat;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Lamp3> lamps = new ArrayList<>();
        lamps.add(new Lamp3(100));
        lamps.add(new Lamp3(20));
        lamps.add(new Lamp3(40));
        lamps.add(new Lamp3(150));

        Collections.sort(lamps);

        for (Lamp3 lamp : lamps){
            System.out.println(lamp);
        }
    }
}
