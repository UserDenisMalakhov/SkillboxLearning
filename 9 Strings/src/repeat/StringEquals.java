package repeat;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Dima";
        String s2 = "DimA";
        System.out.println(s1 == s2); // двойное РАВНО - это сравнение ссылок
        System.out.println(s1.equals(s2)); // сравнивает содержимое объектов
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
