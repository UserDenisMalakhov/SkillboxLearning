import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        for (int i = 0; i <= value; i++){
            for (int t = 0; t <= value; t++){
                if (i * t == value){
                    System.out.println(i + "*" + t);
                }
            }
        }
    }
}
