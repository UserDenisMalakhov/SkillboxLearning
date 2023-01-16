package practice;

import java.util.ArrayList;

public class TodoList3 {
    static ArrayList<String> todoList = new ArrayList<>();

    public ArrayList<String> add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        this.todoList.add(todo);
        System.out.println("Добавлено дело " + '"' + todo + '"');
        return this.todoList;
    }

    public ArrayList<String> add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index <= this.todoList.size() && index >= 0){
            this.todoList.add(index, todo);
            System.out.println("Добавлено дело " + '"' + todo + '"');
        }else {
            this.todoList.add(todo);
            System.out.println("Добавлено дело " + '"' + todo + '"');
        }
        return this.todoList;
    }

    public ArrayList<String> edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index < todoList.size() && index >=0){
            System.out.println("Дело " + '"' + todoList.get(index) + '"' + "заменено на " + todo);
            todoList.set(index, todo);
        }else {
            System.out.println("Дело с таким номером не существует");
        }
        return this.todoList;
    }

    public ArrayList<String> delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index < todoList.size() && index >=0){
            String text = todoList.get(index);
            todoList.remove(index);
            System.out.println("Дело " + '"' + text + '"' + " удалено");
        }else {
            System.out.println("Дело с таким номером не существует");
        }
        return this.todoList;
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        for (int i = 0; i < todoList.size(); i++){
            System.out.println(i + " - " + todoList.get(i));
        }
        return new ArrayList<>(todoList);
    }

    public static void list() {
        if (todoList.size() > 0)
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i) + " - " + todoList.get(i));
            }
        else {
            System.out.println("Вы не запланировали никаких дел. Чтобы добавить задачу введите: \"ADD Какое-то дело\".");
        }
    }
    public static void add(String indexString, String toDoElement) {
        if (toDoElement != null)
        {
            if (indexString != null && Integer.parseInt(indexString.trim()) > 0 &&
                    Integer.parseInt(indexString.trim()) <= todoList.size())
            {
                todoList.add(Integer.parseInt(indexString.trim()) - 1, toDoElement);
            } else {
                todoList.add(toDoElement);
            }
            System.out.println("Дело добавлено в список");
        } else if (toDoElement == null) {
            System.out.println("Вы не ввели описание запланированного дела");
        }
    }
    public static void delete(String indexString) {
        if (indexString != null) {
            int index = Integer.parseInt(indexString.trim());
            if (index > 0 && index <= todoList.size()) {
                todoList.remove(index - 1);
                System.out.println("Задача под номером " + index + " успешно удалена.");
            } else {
                System.out.println("В списке дел отсутствует задача под номером " + index);
            }
        } else {
            System.out.println("Команда некорректна.");
        }
    }

    public static void edit(String indexString, String toDoElement) {
        if (indexString != null && toDoElement != null)
        {
            int index = Integer.parseInt(indexString.trim());
            if (index > 0 && index <= todoList.size()) {
                todoList.set(index - 1, toDoElement);
                System.out.println("Вы успешно изменили задачу под номером " + index);
            } else {
                System.out.println("В списке дел отсутствует задача под номером " + index);
            }
        } else {
            System.out.println("Команда некорректна.");
        }
    }
}
