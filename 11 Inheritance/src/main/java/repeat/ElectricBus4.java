package repeat;

public class ElectricBus4 extends Bus4 {
    private final double minimalTankFullnessRate;
    private static int count;

    public ElectricBus4(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
        count++;
    }

    @Override
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minimalTankFullnessRate; //оставшийся уровень
        if (remainingRate <= 0){
            return 0;
        }
        return (int) (remainingRate / getConsumptionRate());
    }

    public static int getCount() {
        return count;
    }
}
