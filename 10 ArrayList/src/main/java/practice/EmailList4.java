package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList4 {
    public static final String WRONG_EMAIL_ANSWER = "неверный формат email";
    public TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String regex = ("(\\w+@\\w+\\.)(ru|com)");
        if (email.matches(regex)){
            emailList.add(email.toLowerCase());
            System.out.println(email.toLowerCase());
        }else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        ArrayList<String> thisArray = new ArrayList<>();
        for (String singleEmail : emailList){
            System.out.println(singleEmail);
            thisArray.add(singleEmail);
        }
        return thisArray;
    }

}
