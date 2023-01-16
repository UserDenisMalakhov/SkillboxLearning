public class Hard {
    private final HardType hardType;
    private final int valueMemory;
    private final double weight;


    public Hard(HardType hardType, int valueMemory, double weight){
        this.hardType = hardType;
        this.valueMemory = valueMemory;
        this.weight = weight;
    }

    public Hard setHard(HardType hardType){
        return new Hard(hardType, valueMemory, weight);
    }
    public Hard setHard(int valueMemory){
        return new Hard(hardType, valueMemory, weight);
    }
    public Hard setHard(double weight){
        return new Hard(hardType, valueMemory, weight);
    }

    public HardType getHardType() {
        return hardType;
    }

    public int getValueMemory() {
        return valueMemory;
    }

    public double getWeight() {
        return weight;
    }


    public  String toString(){
        return "Процессор :" +
                getHardType() +
                "\n" + getValueMemory() +
                "\n" + getWeight();
    }
}
