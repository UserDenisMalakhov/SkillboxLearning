package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static practice.TodoList3.*;

public class Main3 {
    private static final Pattern manageTasks = Pattern.compile("([A-Z]+)(\\s+\\d+)?\\s*(.+)?");
    private static TodoList3 todoList = new TodoList3();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в приложение \"Список дел\". " +
                "Введите необходимую команду: \"ADD\", \"EDIT\", \"DELETE\" или \"LIST\"");
        Scanner scanner = new Scanner(System.in);

        boolean workIsActive = true;
        while (workIsActive) {
            String command = scanner.nextLine();
            Matcher matcherTasks = manageTasks.matcher(command);
            if (matcherTasks.find()) {
                String commandType = matcherTasks.group(1);
                String indexString = matcherTasks.group(2);
                String toDoElement = matcherTasks.group(3);
                switch (commandType) {
                    case ("LIST"):
                        list();
                        break;
                    case ("ADD"):
                        add(indexString, toDoElement);
                        break;
                    case ("DELETE"):
                        delete(indexString);
                        break;
                    case ("EDIT"):
                        edit(indexString, toDoElement);
                        break;
                    default:
                        System.out.println("Вы ввели недопустимую команду.");
                        break;
                }
            }
        }
    }

}
