package practice;

public class Main1 {
    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки//
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = line.split(",?\\s++");
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        for (int j = 0; j < colors.length / 2; j++){
            String temp = colors[j];
            colors[j] = colors[colors.length - j -1];
            colors[colors.length - j -1] = temp;
        }

        System.out.println("\n");

        for (String color : colors){
            System.out.println(color);
        }
    }
}
