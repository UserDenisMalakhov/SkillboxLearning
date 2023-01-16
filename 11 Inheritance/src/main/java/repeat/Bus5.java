package repeat;

import java.util.Objects;

public class Bus5 {
    private double tankFullnessRate; // rate of tank fullness, 0-1 (на сколько заполнен топливный бак)
    protected double consumptionRate; // rate (0-1) per 1km (расход топлива на 1 км)

    private static int count;

    public Bus5(double consumptionRate){
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

    public void refuel(double tankRate){
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }

    protected int powerReserve(){
        return (int)(tankFullnessRate / consumptionRate);
    }
    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus5 bus5 = (Bus5) o;
        return Double.compare(bus5.tankFullnessRate, tankFullnessRate) == 0 && Double.compare(bus5.consumptionRate, consumptionRate) == 0;
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
