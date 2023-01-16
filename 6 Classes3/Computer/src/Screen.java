public class Screen {
    int diagonal;
    ScreenOptionals screenOptionals;
    double weight;


    public Screen(int diagonal, ScreenOptionals screenOptionals, double weight){
        this.diagonal = diagonal;
        this.screenOptionals = screenOptionals;
        this.weight = weight;
    }

    public Screen setScreen(int diagonal){
        return new Screen(diagonal, screenOptionals, weight);
    }
    public Screen setScreen(ScreenOptionals screenOptionals){
        return new Screen(diagonal, screenOptionals, weight);
    }
    public Screen setScreen(double weight){
        return new Screen(diagonal, screenOptionals, weight);
    }

    public int getDiagonal() {
        return diagonal;
    }

    public ScreenOptionals getScreenOptionals() {
        return screenOptionals;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
        return "Экран: " + "\n" + getDiagonal() + "\n" + getScreenOptionals() + "\n" + getWeight();
    }


}
