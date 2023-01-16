package repeat;

import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        double temp = control.getTemperature();

        AirConditioner conditioner = new AirConditioner();
        conditioner.setTemperature((int) temp);
        System.out.println();

        long now = System.currentTimeMillis(); // милисекунды
        int seconds = (int) (now / 1000);
        System.out.println(seconds);
    }
}
