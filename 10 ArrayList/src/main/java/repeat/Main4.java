package repeat;

public class Main4 {
    public static void main(String[] args) {
        boolean[] array = new boolean[5];
        System.out.println(array[0]);
        System.out.println();

        String[] strings = new String[5];
        System.out.println(strings[0]);
        System.out.println();

        int [][] studentMarks = {
                {3,5,5,3,2,4,4},
                {2,5,4,4,2,2},
                {4,4,5,2,3,5,5,5,5,4},
                {3,3,4,5,5,2,3,4}
        };
        System.out.println(studentMarks.length);
        System.out.println();

        for (int i = 0; i < studentMarks.length; i++){
            System.out.println("Class " + i + " {" + studentMarks[i].length + " students}");
            for (int j = 0; j < studentMarks[i].length; j++){
                System.out.println("\t" + studentMarks[i][j]);
            }
        }
    }
}
