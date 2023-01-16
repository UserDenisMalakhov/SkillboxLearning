public class Prosessor {
    private final int chastota;
    private final int countEggs;
    private final String customer;
    private final double weight;


    public Prosessor(int chastota, int countEggs, String customer, double weight){
        this.chastota = chastota;
        this.countEggs = countEggs;
        this.customer = customer;
        this.weight = weight;
    }


    public Prosessor setProsessor(int countEggs){
        return new Prosessor(chastota, countEggs, customer, weight);
    }
    public Prosessor setProsessor(String customer){
        return new Prosessor(chastota, countEggs, customer, weight);
    }
    public Prosessor setProsessor(double weight){
        return new Prosessor(chastota, countEggs, customer, weight);
    }


    public int getChastota() {
        return chastota;
    }

    public int getCountEggs() {
        return countEggs;
    }

    public String getCustomer() {
        return customer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Поцессор: " +
                "\n" + getChastota() +
                "\n" + getCountEggs() +
                "\n" + getCustomer() +
                "\n" + getWeight();
    }
}
