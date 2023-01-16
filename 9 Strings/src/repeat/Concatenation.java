package repeat;

import java.time.LocalDate;

public class Concatenation {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        String name = "denis";
        String surname = "malakhov";
        LocalDate birthday = LocalDate.of(1996,07,30);

        String fullName = name + " " + surname + " - " + birthday; //
        String fullName1 = "denis" + " " + "malakhov"; //
        String fullName2 = builder.append(name).append(" ").append(surname).toString(); //

        System.out.println(fullName);
        System.out.println(fullName1);
        System.out.println(fullName2);

    }
}
