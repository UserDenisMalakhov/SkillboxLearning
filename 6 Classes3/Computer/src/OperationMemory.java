public class OperationMemory {
    private final String type;
    private final int value;
    private final double weight;


    public OperationMemory(String type, int value, double weight){
        this.type = type;
        this.value = value;
        this.weight = weight;
    }

    public OperationMemory setOperationMemory(String type){
        return new OperationMemory(type, value, weight);
    }
    public OperationMemory setOperationMemory(int value){
        return new OperationMemory(type, value, weight);
    }
    public OperationMemory setOperationMemory(double weight){
        return new OperationMemory(type, value, weight);
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Оперативная память: " +
                "\n" + getType() +
                "\n" + getValue() +
                "\n" + getWeight();
    }
}
