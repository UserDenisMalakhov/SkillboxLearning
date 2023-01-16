package repeat;

public class Main2 {
    // Переопределение методов
    public static void main(String[] args) {
        Bus2 bus2 = new ElectricBus2(0.001, 0.1);
        bus2.refuel(1);
        System.out.println("Резерв: " + bus2.powerReserve());
        System.out.println("Едем 50 км " + bus2.run(50));
        System.out.println("Резерв: " + bus2.powerReserve());
        System.out.println("Едем 900 км " + bus2.run(900));
        System.out.println("Резерв: " + bus2.powerReserve());
        System.out.println("Едем 100 км " + bus2.run(100));
        System.out.println("Резерв: " + bus2.powerReserve());
        System.out.println();
    }
}
