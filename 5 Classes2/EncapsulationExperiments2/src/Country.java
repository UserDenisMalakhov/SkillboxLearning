public class Country {
    private String countryName; // название страны
    private int countPeople; // численность
    private double squareCountry; // площзадь страны
    private String capitalName; // столица
    private boolean enterSea; // выход к морю

    public Country (String countryName){
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public double getSquareCountry() {
        return squareCountry;
    }

    public void setSquareCountry(double squareCountry) {
        this.squareCountry = squareCountry;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isEnterSea() {
        return enterSea;
    }

    public void setEnterSea(boolean enterSea) {
        this.enterSea = enterSea;
    }

}
