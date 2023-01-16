public class Main {
    public static void main(String[] args) {
            Country country1 = new Country("Spain");

            country1.setCountPeople(10_000);
        System.out.println("Численность страны: " + country1.getCountPeople());

            country1.setCapitalName("Madrid");
        System.out.println("Столица: " + country1.getCapitalName());

    }
}