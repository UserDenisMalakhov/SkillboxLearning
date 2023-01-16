package repeat;

public class Main3 {
    public static void main(String[] args) {
        int age = 37;
        String name = "Anna";


        //неявное преобразование переменной типа int
        String personalInfo = name + " - " + age + " лет";
        System.out.println(personalInfo); //1


        // явное преобразование переменной типа int
        String value = Integer.toString(age);// 2
        System.out.println(age);
        Integer age1 = 40;

        String value1 = age1.toString();
        Double weight = 2.54;
        String value2 = weight.toString(); // 3

        String value3 = String.valueOf(weight); // 4
        System.out.println(value3);
        System.out.println();


        // ПРЕОБРАЗОВАНИЕ СТРОКИ В ЧИСЛО

        String number = "353452435";
        int numberInt = Integer.parseInt(number);
        System.out.println(numberInt);
        String number1 = "3.43524524524";
        double number1Double = Double.parseDouble(number1);
        System.out.println(number1Double);

    }
}
