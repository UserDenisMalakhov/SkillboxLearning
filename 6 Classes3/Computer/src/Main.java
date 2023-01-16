public class Main {
    public static void main(String[] args) {
        Hard hard1 = new Hard(HardType.HDD, 256, 2.5);
        Screen screen1 = new Screen(10, ScreenOptionals.IPS, 3.1);
        Keyboard keyboard1 = new Keyboard("Механика", true, 0.5);
        OperationMemory operationMemory1 = new OperationMemory("тип памяти", 122, 0.111);
        Prosessor prosessor1 = new Prosessor(235, 16, "Intel", 5);

        Computer computer1 = new Computer("China", "Intel");
        computer1.setOperationMemory(operationMemory1);
        computer1.setProsessor(prosessor1);
        computer1.setHard(hard1);
        computer1.setKeyboard(keyboard1);
        computer1.setScreen(screen1);
        System.out.println(computer1.toString());
    }
}