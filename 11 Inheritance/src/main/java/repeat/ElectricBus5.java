package repeat;

public class ElectricBus5 extends Bus5{
    private final double minimalTankFullnessRate;
    private static int count;

    private static final double degradationRate = 0.0001;
    private static final double minRateToDegrade = 0.1;

    public ElectricBus5(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
        count++;
    }

    @Override
    public void refuel(double tankRate) {
        super.refuel(tankRate);
        if (tankRate > minRateToDegrade){
            consumptionRate += degradationRate;
        }
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
