public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Banana", 500);
        Product product2 = new Product("Orange", 430);
        System.out.println("Стоимость продукта = " + product1.getPrice());
        System.out.println(product2.getPrice() + product1.getPrice());
        System.out.println(Product.getCount());
        System.out.println(Product.totalPrice);
        System.out.println(Product.getAveragePrice());

    }
}