package practice;

public class CardAccount extends BankAccount {
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
    private double withdrawPercent = 1;

    @Override
    public void take(double amountToTake) {
        double commission = amountToTake * withdrawPercent / 100;
        super.take(amountToTake + commission);
    }
}

