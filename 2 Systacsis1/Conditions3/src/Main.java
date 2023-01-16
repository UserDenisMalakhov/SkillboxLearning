public class Main {
    public static void main(String[] args) {

        int paperReserve = 600_000;
        int inkReserve = 600_000;
        int coverReserve = 2_000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;

        boolean coldPrintingMode = false;
        double printRollerTemp = 200;

        int papersCount = booksCount * pagesInBook / 2;

        boolean paperIsEnough = paperReserve >= papersCount;
        boolean inkIsEnough = inkReserve >= (papersCount + booksCount);
        boolean coversAreEnough = coverReserve >= booksCount;
        boolean rollerTempIsNormal =
                printRollerTemp >= printRollerMinTemp &&
                        printRollerTemp <= printRollerMaxTemp;

        if (paperIsEnough && inkIsEnough && coversAreEnough && (coldPrintingMode || rollerTempIsNormal)) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }
}