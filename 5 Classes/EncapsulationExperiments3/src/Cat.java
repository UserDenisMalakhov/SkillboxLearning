public class Cat {
    private String name;
    private int age;
    private boolean meaw = true;
    private double weight;


    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat (String name, int age, boolean meaw){
        this.name = name;
        this.age = age;
        this.meaw = meaw;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMeaw() {
        return meaw;
    }

    public void setMeaw(boolean meaw) {
        this.meaw = meaw;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
