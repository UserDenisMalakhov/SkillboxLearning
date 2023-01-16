public class Car {
    private Engine engine;
    private CarType carType;
    private int weight;


    public Car(Engine engine, CarType carType, int weight){
        this.engine = engine;
        this.carType = carType;
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getWeight() {
        return weight;
    }
}
