package repeat;

public interface ElectricDevice {

    boolean isSwithedON();

    void switchOn();

    void switchOff();

    double getEnergyConsumption(); // интерфейсы всегда публичны

    default void toggle(){
        if (isSwithedON()){
            switchOff();
        }else {
            switchOn();
        }
    }
}
