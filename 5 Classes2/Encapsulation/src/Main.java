import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            Scanner sc = new Scanner(System.in);
            int floor = sc.nextInt();
            elevator.move(floor);
        }
    }
}