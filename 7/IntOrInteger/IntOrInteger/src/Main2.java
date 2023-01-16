public class Main2 {
    public static void main(String[] args) {
        char tab = '\t';
        int tapCode = tab;
        System.out.println(tapCode);
        System.out.println();

        char tab1 = (char) 9;
        System.out.println(tab1);
        System.out.println();

        for (int i = 0; i < 65536; i++){
            char c = (char) i;
            System.out.println(i + " - " + c);
        }
    }
}
