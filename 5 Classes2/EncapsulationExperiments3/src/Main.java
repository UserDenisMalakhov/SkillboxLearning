public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        cat1.setWeight(5);
        System.out.println(cat1.getWeight() + " " + cat1.getName());

        Cat cat2 = new Cat("ZUZU", 12);
        cat2.setWeight(10);
        System.out.println(cat2.getWeight() + " " + cat2.getName());

        Cat cat3 = new Cat("Fedor", 22);
        cat3.setWeight(33);
        System.out.println(cat3.getWeight() + " " + cat3.getName() + " " + cat3.isMeaw());
    }
}