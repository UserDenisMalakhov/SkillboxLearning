public class Product {
    private final String name;
    private final int price;

    static int count;
    static int totalPrice;

    public static int getCount(){
        return count;
    }
    public static double getAveragePrice() {
        return (double) totalPrice / count;
    }


    public Product(String name, int price){
        this.name = name;
        this.price = price;
        count++;
        totalPrice = price + totalPrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
