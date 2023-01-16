package repeat;

//interface
public class Chandelier4 extends LightingDevice4 {
    private static final int LAMP_BRIGHTNESS_STEPS = 2;
    private static final double CONSUMPTION_COEFF = 1.095;

    private final int lampsCount;

    public Chandelier4(int power, int lampsCount){
        super(power);
        this.lampsCount = lampsCount;
    }

    @Override
    public void setBrightness(double level){
        double step = 1.0 / (lampsCount * LAMP_BRIGHTNESS_STEPS);
        int stepsCount = (int)Math.round(level / step);
        super.setBrightness(stepsCount * step);
    }

    @Override
    public double getEnergyConsumption(){
        return power * Math.pow(brightness, CONSUMPTION_COEFF);
    }
}

