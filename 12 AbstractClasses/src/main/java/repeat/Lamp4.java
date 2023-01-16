package repeat;

//Comparable
public class Lamp4 extends LightingDevice4 {

    public Lamp4(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption(){
        return power * brightness;
    }

}
