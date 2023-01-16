public class Main {
    public static void main(String[] args) {
        MoneyCalculator moneyCalculator1 = new MoneyCalculator();
        MoneyCalculator moneyCalculator2 = new MoneyCalculator();
        MoneyCalculator moneyCalculator3 = new MoneyCalculator();
        MoneyCalculator moneyCalculator4 = new MoneyCalculator();
        MoneyCalculator moneyCalculator5 = new MoneyCalculator();
        MoneyCalculator moneyCalculator6 = new MoneyCalculator();

        moneyCalculator1.calculateCassetteCount(1999);
        System.out.println();
        moneyCalculator2.calculateCassetteCount(2000);
        System.out.println();
        moneyCalculator3.calculateCassetteCount(2001);
        System.out.println();
        moneyCalculator4.calculateCassetteCount(2500);
        System.out.println();
        moneyCalculator5.calculateCassetteCount(4000);
        System.out.println();
        moneyCalculator6.calculateCassetteCount(4001);

    }

    public static class MoneyCalculator{
        private static final int BANKNOTES_PER_PACK = 100;
        private static final int PACKS_IN_CASSETTE = 20;

        public void calculateCassetteCount(int banknoteCount){
            int packsCount = banknoteCount / BANKNOTES_PER_PACK +
                    (banknoteCount % BANKNOTES_PER_PACK == 0 ? 0 : 1);
            System.out.println("Количество пачек = " + packsCount);

            int cassetteCount = packsCount / PACKS_IN_CASSETTE;
            if ((packsCount % PACKS_IN_CASSETTE) != 0){
                cassetteCount++;
            }
//          +(packsCount % PACKS_IN_CASSETTE == 0 ? 0 : 1); короткий вариант
            System.out.println("Количество кассет = " + cassetteCount);
        }
    }
}