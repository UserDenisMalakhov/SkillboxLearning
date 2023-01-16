package repeat;

public class Main1 {
    public static void main(String[] args) {
        Bus1 bus1 = new Bus1(0.001);
        bus1.refuel(1);
        System.out.println("Резерв: " + bus1.powerReserve());
        System.out.println("Едем 50 км " + bus1.run(50));
        System.out.println("Резерв: " + bus1.powerReserve());
        System.out.println("Едем 900 км " + bus1.run(900));
        System.out.println("Резерв: " + bus1.powerReserve());
        System.out.println("Едем 100 км " + bus1.run(100));
        System.out.println("Резерв: " + bus1.powerReserve());

        System.out.println();

        Bus1 bus2 = new ElectricBus1(0.001, 0.1);
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
