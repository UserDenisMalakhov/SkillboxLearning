public class Main {
    public static void main(String[] args) {
        int volume = 1200; // объем бассейна
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int timeValue = 0;
        int difFilling = fillingSpeed - devastationSpeed;
        int fillingValueNow = 0;

        while (fillingValueNow < volume) {
            fillingValueNow += difFilling;
            timeValue++;
        }
        System.out.println("Заполнится за " + timeValue + " минут");
    }

//        while (volume <= 1200){
//
//        }
//
//        for (int i = 0; i <= volume; i += devastationSpeed) {
//            int time = volume / difFilling;
//            System.out.println(time);
//        }
    }
