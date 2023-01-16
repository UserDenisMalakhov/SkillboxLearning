public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(1,2,3);
        dimensions.setLength(1900);
        dimensions.setWidth(1900);
        dimensions.setHeight(1900);
        StorageOfCargoInformation cargoInformation = new StorageOfCargoInformation(
                50.02,
                "Проспект",
                dimensions,
                true,
                "12-13-14",
                true,
                1,
                1,
                1);
        cargoInformation = cargoInformation.setWeight(111);
        System.out.println(cargoInformation);
    }
}
