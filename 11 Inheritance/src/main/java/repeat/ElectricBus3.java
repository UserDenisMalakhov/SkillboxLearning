package repeat;

public class ElectricBus3 extends Bus3{

    private final double minimalTankFullnessRate;
    private static int count;

    public ElectricBus3(double consumptionRate, double minimalTankFullnessRate) {
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
