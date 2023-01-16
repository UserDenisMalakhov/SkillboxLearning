public class Main {
    public static void main(String[] args) {

        int vasyaAge = 3;
        int katyaAge = 2;
        int mishaAge = 1;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        }else if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        }else {
            min = mishaAge;
        }

        if ((vasyaAge <= mishaAge && vasyaAge >= katyaAge) ||
                (vasyaAge >= mishaAge && vasyaAge <= katyaAge)) {
            middle = vasyaAge;
        }else if ((mishaAge <= vasyaAge && mishaAge >= katyaAge) ||
                (mishaAge >= vasyaAge && mishaAge <= katyaAge)) {
            middle = mishaAge;
        }else {
            middle = katyaAge;
        }

        if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
        }else if (vasyaAge > mishaAge && vasyaAge > katyaAge) {
            max = vasyaAge;
        }else {
            max = katyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);

    }
}