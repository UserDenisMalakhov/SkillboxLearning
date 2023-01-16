package repeat;

import java.math.BigInteger;

public class Main4 {
    public static void main(String[] args) {
        double value = 24.0 * 0.1;
        System.out.println(value);
        System.out.println();

        System.out.println((double) Math.PI);
        System.out.println((float) Math.PI);
        System.out.println();

        double epsilon = 0.00000000001;
        double value1 = 2.0 - 1.1;
        double value2 = 0.9;
        boolean comparison = Math.abs(value1 - value2) < epsilon;
        System.out.println(comparison);
        System.out.println();


        BigInteger integer = new BigInteger("123445346458694585");
        BigInteger integer1 = new BigInteger("32964519356123412357623754");
        integer = integer.add(integer1);
        System.out.println(integer);
        integer1 = integer1.multiply(integer);
        System.out.println(integer1);
        BigInteger integer2 = new BigInteger("783416519873465");
        integer2 = integer2.remainder(new BigInteger("783416519873"));
        System.out.println(integer2);
        System.out.println(integer.compareTo(integer1));

    }
}
