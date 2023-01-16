package repeat;

public class ElectricBus1 extends Bus1{

    private final double minimalTankFullnessRate;

    public ElectricBus1(double consumptionRate, double minimalTankFullnessRate) {
        super(consumptionRate);
        this.minimalTankFullnessRate = minimalTankFullnessRate;
    }

}
