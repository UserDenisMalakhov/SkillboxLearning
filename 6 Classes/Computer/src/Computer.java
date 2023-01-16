public class Computer {
    public Prosessor prosessor;
    public OperationMemory operationMemory;
    public Hard hard;
    public Screen screen;
    public Keyboard keyboard;

    public Prosessor getProsessor() {
        return prosessor;
    }

    public void setProsessor(Prosessor prosessor) {
        this.prosessor = prosessor;
    }

    public OperationMemory getOperationMemory() {
        return operationMemory;
    }

    public void setOperationMemory(OperationMemory operationMemory) {
        this.operationMemory = operationMemory;
    }

    public Hard getHard() {
        return hard;
    }

    public void setHard(Hard hard) {
        this.hard = hard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String vendor;
    public String name;


    public Computer(String vendor, String name){
        this.vendor = vendor;
        this.name = name;
    }
    public double getTotalWeight(){
        return prosessor.getWeight() + operationMemory.getWeight() + hard.getWeight() +
                screen.getWeight() + keyboard.getWeight();
    }



    public String toString(){
        return "Данные о компьютере:" + "\n" + "\n" +
                "Страна производитель: " + getName() + "\n" +
                "Поставщик: " + getVendor() + "\n" +
                prosessor.toString() + "\n" + operationMemory.toString() + "\n" + hard.toString() + "\n" +
                screen.toString() +  "\n" +keyboard.toString() + "\n" +
                "Общий вес омпьютера: " + getTotalWeight() + "гр." + "\n";

    }

}
