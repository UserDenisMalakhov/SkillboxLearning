package repeat;

//Comparable
public class Lamp3 extends LightingDevice3 {

    public Lamp3(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption(){
        return power * brightness;
    }

}
