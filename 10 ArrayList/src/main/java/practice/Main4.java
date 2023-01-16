package practice;

import java.util.Scanner;

public class Main4 {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static EmailList4 emailList = new EmailList4();

    public static void main(String[] args) {
        System.out.println("Введите команду \"ADD\" или \"LIST\"");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equals("0")) {
                break;
            }
            String[] text = input.split("\\s", 2);
            String command = text[0].trim();

            switch (command) {
                case "ADD":
                    String email = text[1].trim();
                    emailList.add(email.toLowerCase());
                    break;
                case "LIST":
                    emailList.getSortedEmails();
                    break;
                default:
                    System.out.println("Введена неверная команда");
                    break;
            }

            //TODO: write code here


        }
    }
}
