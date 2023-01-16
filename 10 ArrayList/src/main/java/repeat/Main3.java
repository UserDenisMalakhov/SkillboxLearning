package repeat;

public class Main3 {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[]colors = text.split(",?\\s+");
        for (int i = colors.length-1; i >=0; i--){
            System.out.println(colors[i]);
        }
        System.out.println();

        String text1 = "Каждый Каждый охотник желает знать знать, где сидит фазан";
        String[]colors1 = text1.split(",?\\s+");
        for (int j = 0; j < colors1.length; j++){
            if (j > 0 && colors1[j].equals(colors1[j - 1])){
                continue;
            }
            System.out.println(colors1[j]);
        }
        System.out.println();
    }
}
