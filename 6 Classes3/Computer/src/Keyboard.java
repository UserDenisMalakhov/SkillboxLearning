public class Keyboard {
    private final String type;
    private final boolean light;
    private final double weight;


    public Keyboard(String type, boolean light, double weight){
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public Keyboard setKeyboard(String type){
        return new Keyboard(type, light, weight);
    }
    public Keyboard setKeyboard(boolean light){
        return new Keyboard(type, light, weight);
    }
    public Keyboard setKeyboard(double weight){
        return new Keyboard(type, light, weight);
    }

    public String getType() {
        return type;
    }

    public boolean isLight() {
        return light;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Клавиатура: " + "\n" +
                getType() + "\n" + isLight() + "\n" + getWeight();
    }


}
