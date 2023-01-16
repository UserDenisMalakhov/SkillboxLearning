package repeat;

import java.nio.charset.Charset;

public class CharExp {
    public static void main(String[] args) {

        /* Метод toCharArray() возвращает массив символов типа char.
         Далее мы можем обратиться к любому символу методом перебора.*/
        String hello = "Hello";
        char [] chars = hello.toCharArray();
        for (char c : chars){
            System.out.println(c);
        }
        System.out.println();

        /*Если вам известно, на какой позиции находится нужный символ,
        то на помощь придёт другой метод — charAt().
        Ему нужно передать номер позиции.*/
        String hello1 = "Hello";
        char firstChar = hello1.charAt(0);
        System.out.println("Первая буква: " + firstChar);
        System.out.println();


        /*Обратите внимание, что, как и в любом массиве, индексы в строке начинаются с нуля.
                Попытка передать значение, которое больше, чем длина строки, приведёт к ошибке.
        Например, такой код:*/
//        String hello2 = "Hello";
//        char firstChar1 = hello1.charAt(hello2.length());
//        System.out.println("Первая буква: " + firstChar1);
//        System.out.println();


        String str = "Это тестовая строка для подсчёта пробелов";
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов: " + spaceCount);
        System.out.println();


        // Trim() - удаляет пробелы в начале и в конце
        String text = "  Some spaces at the start and at the end   ";
        System.out.println("Исходный текст " + text);
        String clearedText = text.trim();
        System.out.println("Полученный текст " + clearedText);
        System.out.println();

        /*
        Начиная с 11-й версии, в Java появился новый метод strip(),
        который убирает не только пробелы, но и другие символы,
        которые могут считаться пробелами в различных кодировках.
        Поэтому, если у вас JDK 11-й версии и выше, то предпочтительно использовать метод strip().
         */


        /*
        Предположим, что у вас есть небольшой текст, и вам нужно проверить,
        начинается ли он с цифры. Как это сделать?
        На помощь придёт метод isDigit класса Character — он как раз проверяет,
        является ли переданный ему в качестве параметра символ цифрой:
         */


        String text1 = "1990 year";
        if (Character.isDigit(text1.charAt(0))) {
            System.out.println("This is a digit");
        } else {
            System.out.println("This is not a digit");
        }
        System.out.println();


        /*
        Также есть другие полезные методы, которыми можно пользоваться при написании программ:

        isLetter — проверяет, является ли переданный символ буквой;

        isIdeographic — проверяет, является ли переданный символ иероглифом;

        isJavaLetterOrDigit — проверяет,
        является ли переданный символ допустимым при именовании переменных и методов в Java.
         */

        System.out.println(Charset.defaultCharset());


    }
}
