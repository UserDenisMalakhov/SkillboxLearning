public class Engine {
    private EngineType type;
    private double value;
    private int muscle;


    public Engine(EngineType engineType, double value, int muscle){
        this.type = engineType;
        this.value = value;
        this.muscle = muscle;
    }

    public EngineType getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public int getMuscle() {
        return muscle;
    }

}
