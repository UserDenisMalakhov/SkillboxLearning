import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        boolean hasError = value > 0;
        if (!hasError) {
            System.out.println("Введите любое число > 0");
        } else {
            int factorial = 1;
            for (int i = 1; i <= value; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + value + " is: " + factorial);
        }
    }
}

