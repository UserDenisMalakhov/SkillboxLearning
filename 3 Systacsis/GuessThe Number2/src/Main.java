import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = new Random().nextInt(100);
        System.out.println("Угадайте загаданное число");
        System.out.println("Введите число и нажмите <Enter>");

        while (true) {
            int attempt = sc.nextInt();
            if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else if (attempt < value) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы угадали!");
            }
        }
    }
}