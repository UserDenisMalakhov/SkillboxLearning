package repeat;


//Переопределение статических методов невозможно!!

public class Main3 {
    public static void main(String[] args) {
        Bus3 bus1 = new Bus3(0.001);
        Bus3 bus2 = new Bus3(0.001);
        Bus3 bus3 = new Bus3(0.001);

        ElectricBus3 ebus1 = new ElectricBus3(0.001, 0.1);
        ElectricBus3 ebus2 = new ElectricBus3(0.001, 0.1);
        ElectricBus3 ebus3 = new ElectricBus3(0.001, 0.1);

        System.out.println("Количество автобусов: " + Bus3.getCount());
        System.out.println("Количество электробусов: " + ElectricBus3.getCount());
    }
}
