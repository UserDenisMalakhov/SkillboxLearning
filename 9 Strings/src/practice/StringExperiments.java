package practice;

import java.util.Scanner;

public class StringExperiments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.equals(s2)){
                System.out.println(s1 + " == " + s2);
            }else {
                System.out.println(s1 + " != " + s2);
            }
        }

    }
}
