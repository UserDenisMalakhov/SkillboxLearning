package practice;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        PhoneBook5 phoneBook = new PhoneBook5();
        Scanner scanner = new Scanner(System.in);
        String regexPhone = "(^[7]{1})([8,9]){1}[0-9]{9}$";
        String regexName = "(^[А-Я]{1})([а-я,ё]+)$";

        for (;;){
            System.out.println("Введите номер, имя или команду: ");
            String firstCommand = scanner.nextLine();
            if (firstCommand.matches(regexName)){
                if (phoneBook.getContactByName(firstCommand).size() > 0){
                    System.out.println(phoneBook.getContactByName(firstCommand));
                }else {
                    System.out.println("Такого имени в телефонной книге нет.");
                    System.out.println("Введите номер телефона для абонента " + "\"" +
                            firstCommand + "\":");
                    String textForPhoneNumber = scanner.nextLine();
                    phoneBook.addContact(textForPhoneNumber, firstCommand);
                    System.out.println("Контакт сохранен");
                }
            } else if (firstCommand.matches(regexPhone)) {
                if (phoneBook.getContactByPhone(firstCommand).length() > 0){
                    System.out.println(phoneBook.getContactByPhone(firstCommand));
                }else {
                    System.out.println("Такого номера нет в телефонной книге.");
                    System.out.println("Введите имя абонента для номера " + "\"" +
                            firstCommand + "\":" );
                    String textForName = scanner.nextLine();
                    phoneBook.addContact(firstCommand, textForName);
                    System.out.println("Контакт сохранен");
                }
            } else if (firstCommand.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
            }else {
                System.out.println("Неверный формат ввода");
            }
        }
    }

}
