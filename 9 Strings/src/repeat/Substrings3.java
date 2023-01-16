package repeat;
//Механизм форматирования строк

public class Substrings3 {
    public static void main(String[] args) {
        String name = "Masha";
        int birthDay = 1986;
        //{"name": "Masha", "birthYear": "1986"}
        String template = "{\"name\": \"%s\", \"birthYear\": \"$d\"}";
        String result = String.format(template, name, birthDay);
        System.out.println(result);
        System.out.printf(template,name,birthDay);

    }
}
