package repeat;

public class Lamp1 extends LightingDevice1 {

    public Lamp1(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption(){
        return power * brightness;
    }

}
