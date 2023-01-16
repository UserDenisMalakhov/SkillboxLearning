package repeat;

//interface
public abstract class LightingDevice4 implements ElectricDevice, Comparable{
    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_BRIGHTNESS = 0D;

    protected final int power;
    protected double brightness;


    public LightingDevice4(int power){
        this.power = power;
    }

    @Override
    public boolean isSwithedON() {
        return brightness > 0;
    }

    @Override
    public void switchOn() {
        setBrightness(MAX_BRIGHTNESS);
    }

    @Override
    public void switchOff() {
        setBrightness(MIN_BRIGHTNESS);
    }


    public void setBrightness(double level){
        if (level < MIN_BRIGHTNESS){
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        }else {
            brightness = level;
        }
    }


    public double getBrightness() {
        return brightness;
    }

    public void changeBrightness(double rate){
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }


    @Override
    public int compareTo(Object o) {
        LightingDevice4 lightingDevice = (LightingDevice4) o;
        return Integer.compare(power, lightingDevice.power);
    }

    @Override
    public String toString() {
        return getClass().getName() + " with power: " + power;
    }

}
