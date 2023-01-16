public class Main2 {
    public static int i = 1;
    public static int max = 10;

    public static void main(String[] args) {
        iterate();
    }
    public static void iterate(){
        if (i < max){
            i++;
            System.out.println(i);
            iterate();
        }
    }
}
