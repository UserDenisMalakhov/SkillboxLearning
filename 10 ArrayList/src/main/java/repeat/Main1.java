package repeat;

public class Main1 {
    public static void main(String[] args) {

        //1
        int[] roomCount = new int[6]; // неинициализированный массив из 6 элементов
        roomCount[0] = 200;
        roomCount[1] = 100;

//        for (int i = 0; i <= roomCount.length - 1; i++){
//            System.out.println(roomCount[i]);
//        }
        for (int i = 0; i < roomCount.length; i++){
            System.out.println(roomCount[i]);
        }
        System.out.println();

        int[] roomCount1 = {300, 400, 500, 600};
        for (int j = 0; j < roomCount1.length; j++){
            System.out.println(roomCount1[j]);

        }
        System.out.println();


        //2
        String[] colors = {"Красный", "Оранжевый",
                "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};
        for (int r = 0; r < colors.length; r++){
            System.out.println(colors[r]);
        }
        System.out.println();

        String text = "Каждый охотник желает знать, где сидит фазан";
        String[]colors1 = text.split(",?\\s+");
        for (int f = 0; f < colors.length; f++){
            System.out.println(colors1[f]);
        }
        System.out.println();


    }
}
