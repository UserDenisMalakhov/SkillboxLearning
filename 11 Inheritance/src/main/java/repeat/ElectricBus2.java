package repeat;

public class ElectricBus2 extends Bus2{

    private final double minimalTankFullnessRate;

    public ElectricBus2(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }

    @Override
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minimalTankFullnessRate; //оставшийся уровень
        if (remainingRate <= 0){
            return 0;
        }
        return (int) (remainingRate / getConsumptionRate());
    }
}
