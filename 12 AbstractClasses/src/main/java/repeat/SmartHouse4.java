package repeat;

import java.util.ArrayList;

public class SmartHouse4 {

    public SmartHouse4(){
        initLightingDevices();
        lightingDevices = new ArrayList<>();
    }

    public double getEnergyConsumption(){
        double sum = 0;
        for (LightingDevice4 lightingDevices : lightingDevices){
            sum += lightingDevices.getEnergyConsumption();
        }
        return sum;
    }

    public void switchOffAllLight(){
        for (LightingDevice4 lightingDevices : lightingDevices){
            if (lightingDevices instanceof LightingDevice4){
                lightingDevices.switchOff();
            }
        }
    }

    private void initLightingDevices(){
        lightingDevices.add(new Lamp4(100));
        lightingDevices.add(new Lamp4(60));
        lightingDevices.add(new Lamp4(40));

        lightingDevices.add(new Chandelier4(100,4));
        lightingDevices.add(new Chandelier4(400,10));
        lightingDevices.add(new Chandelier4(250,5));
        lightingDevices.add(new Chandelier4(120,3));

    }

    private ArrayList<LightingDevice4> lightingDevices;

    public void switchOffAllDevices(){
        for (LightingDevice4 lightingDevices : lightingDevices){
            lightingDevices.switchOff();
        }
    }

}
