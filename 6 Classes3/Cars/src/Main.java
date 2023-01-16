public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new Engine(EngineType.DIESEL,4, 400), CarType.SUV, 3);
        Car car2 = new Car(new Engine(EngineType.GAS,5, 350), CarType.COUPE, 4);
        Car car3 = new Car(new Engine(EngineType.PETROL,6, 300), CarType.SEDAN, 2);
        Car car4 = new Car(new Engine(EngineType.HYBRID, 8, 850), CarType.CABRIOLET, 5);

        System.out.println("Тип автомобиля: " + car1.getCarType() + "\n" +
                "Масса двигателя: " + car1.getWeight() + "\n" +
                "Тип двигателя: " + car1.getEngine().getType() + "\n" +
                "Объем двигателя: " + car1.getEngine().getValue() + "\n" +
                "Мощность двигателя: " +  car1.getEngine().getMuscle());
    }
}