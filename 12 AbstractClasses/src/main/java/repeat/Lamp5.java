package repeat;

//Comparable
public class Lamp5 extends LightingDevice4 {

    public Type type;

    public enum Type{
        INCANDESCENT,
        FILAMENT,
        LED,
        LUMINESCENT
    }

    public Lamp5(int power) {
        super(power);
    }

    @Override
    public double getEnergyConsumption(){
        return power * brightness;
    }



    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
