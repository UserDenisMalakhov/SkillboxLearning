import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Введите число и нажмите <Enter>:");
        Scanner sc = new Scanner(System.in);

        while (true){
            int value = sc.nextInt();
            if (value > 0){
                sum = sum + value;
                System.out.println("Сумма равна : " + sum);
                System.out.println("Введите ещё одно число или 0 для сброса суммы:");
            }else if (value == 0){
                System.out.println("Сумма сброшена. Введите новое число:");
                sum = 0;
            }
        }
    }
}
