package repeat;

public class Main {
    public static void main(String[] args) {
        String name = "Denis";
        String empty = "";
        String blank = "    \t\t";
        System.out.println();


        // Проверка на пустую строку
        boolean a = empty.length() == 0;
        boolean b = empty.isEmpty();
        boolean c = empty.isBlank();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(blank.isBlank());
    }
}
