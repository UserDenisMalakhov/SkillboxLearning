package repeat;

public class Bus2 {
    private double tankFullnessRate; // rate of tank fullness, 0-1 (на сколько заполнен топливный бак)
    private final double consumptionRate; // rate (0-1) per 1km (расход топлива на 1 км)

    public Bus2(double consumptionRate){
        this.consumptionRate = consumptionRate;
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

    public double getConsumptionRate() {
        return consumptionRate;
    }
    public double getTankFullnessRate() {
        return tankFullnessRate;
    }
}
