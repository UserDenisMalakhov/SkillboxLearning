package repeat;

//interface
public class Lamp2 extends LightingDevice2 {

    public Lamp2(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption(){
        return power * brightness;
    }

}
