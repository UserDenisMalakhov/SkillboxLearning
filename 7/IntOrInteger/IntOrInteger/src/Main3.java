public class Main3 {
    public static int f = 5;

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println();

        String str = "12345";
        int a = Integer.parseInt(str);
        System.out.println(a);
        System.out.println("this is integer");
        System.out.println();

        int b = 123;
        String str1 = Integer.toString(b);
        System.out.println(str1 + " " + "this is String");
        System.out.println();

        Integer g = 4;
        if(g <= f){
            System.out.println("ok");
        }
    }
}
