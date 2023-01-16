package repeat;

import java.util.Objects;

public class Bus4 {
    private double tankFullnessRate; // rate of tank fullness, 0-1 (на сколько заполнен топливный бак)
    private final double consumptionRate; // rate (0-1) per 1km (расход топлива на 1 км)

    private static int count;

    public Bus4(double consumptionRate){
        this.consumptionRate = consumptionRate;
        count++;
    }

    public boolean run (int distance) {
        if (powerReserve() < distance) {
            return false;
        }
        tankFullnessRate -= distance * consumptionRate;
        return true;
    }

    public final void refuel(double tankRate){
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }

    public int powerReserve(){
        return (int)(tankFullnessRate / consumptionRate);
    }
    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus4 bus4 = (Bus4) o;
        return Double.compare(bus4.tankFullnessRate, tankFullnessRate) == 0 && Double.compare(bus4.consumptionRate, consumptionRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tankFullnessRate, consumptionRate);
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }
    public double getTankFullnessRate() {
        return tankFullnessRate;
    }


    @Override
    public String toString() {
        return "Bus4{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", consumptionRate=" + consumptionRate +
                '}';
    }
}
