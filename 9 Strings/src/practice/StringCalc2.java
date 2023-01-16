package practice;

import java.util.Scanner;

public class StringCalc2 {
    public StringCalc2() {

    }

    public int math() {

        while(true) {
            System.out.println("Введите значения");
            Scanner scanner = new Scanner(System.in);

            String firstNumberLine = scanner.nextLine().trim();
            String mathSymbol = scanner.nextLine().trim();
            String secondNumberLine = scanner.nextLine().trim();

            int firstNumber = Integer.parseInt(firstNumberLine);
            int secondNumber = Integer.parseInt(secondNumberLine);

            int result = 0;

            switch (mathSymbol) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }
            System.out.println(result);
        }
    }
}





//    public int sum(){
//        System.out.println("Введите 2 числа. Сложение");
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        int sum = Integer.parseInt(a.trim()) + Integer.parseInt(b.trim());
//        return sum;
//    }
//    public int minus(){
//        System.out.println("Введите 2 числа. Вычитание");
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        int minus = Integer.parseInt(a.trim()) - Integer.parseInt(b.trim());
//        return minus;
//    }
//    public int multi(){
//        System.out.println("Введите 2 числа. Умножение");
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        int muili = Integer.parseInt(a.trim()) * Integer.parseInt(b.trim());
//        return muili;
//    }
//    public int del(){
//        System.out.println("Введите 2 числа. Деление");
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        int del = Integer.parseInt(a.trim()) / Integer.parseInt(b.trim());
//        return del;
//    }
//
//}
