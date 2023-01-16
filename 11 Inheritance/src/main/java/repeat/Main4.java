package repeat;


//Класс Object
public class Main4 {
    public static void main(String[] args) {
        Bus4 bus1 = new Bus4(0.001);
        Bus4 bus2 = new Bus4(0.001);

        System.out.println(bus1.equals(bus2));  //Bus3 bus2 = bus1; - такой код выдаст true

        System.out.println();

        Class objectClass = bus1.getClass();
        System.out.println(objectClass.getName());

        System.out.println();

        System.out.println(bus1);
        System.out.println(bus1.toString());
        System.out.println(bus1.getClass().getName() + "@" + Integer.toHexString(bus1.hashCode()));

    }
}
