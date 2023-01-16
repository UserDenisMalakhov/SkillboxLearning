public class Main {
    public static void main(String[] args) {
        Product product = new Product("Молоко", "4601162190823");
        product.setPrice(89);
        System.out.println("Название: " + product.getName());
        System.out.println("Цена: " + product.getPrice());
        System.out.println("Штрих-код: " + product.getBarCode());
    }
}