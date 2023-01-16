public class Main {
    public static void main(String[] args) {
        String s1 = "Печать разрешена";
        String s2 = "Печать запрещена";


        boolean errors = true;

        String message = errors ? s2:s1;
        System.out.println(message);

    }
}