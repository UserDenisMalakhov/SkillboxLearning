package practice;

public class ReverseArray1 {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        for (int j = 0; j < strings.length / 2; j++){
            String temp = strings[j];
            strings[j] = strings[strings.length - j -1];
            strings[strings.length - j -1] = temp;
        }
        return strings;
    }
}

