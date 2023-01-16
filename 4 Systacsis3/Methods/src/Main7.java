public class Main7 {
    public static void main(String[] args) {
            Employee employee1 = new Employee("Ivan","");
            Employee employee2 = new Employee("John", 8908);
            Employee employee3 = new Employee("Mary", "3444@mail.ru", 237486);

            employee1.printInfo();
        System.out.println();

            employee2.printInfo();
        System.out.println();

            employee3.printInfo();
        System.out.println();

            Order order1 = new Order();
            order1.addProducts(12, 144);
        System.out.println(order1.getProductCount());
        System.out.println();

        User dima = new User("Dima", 26);
        System.out.println(dima.getName());

    }
}
