package practice;

public class BankAccount {
    private double amount;

    public double getAmount() {
        //TODO: реализуйте метод и удалите todo
        // верните значение количества денег не счету
        return amount;
    }

    public void put(double amountToPut) {
        //TODO: реализуйте метод и удалите todo
        // метод зачисляет деньги на счет
        if (amountToPut < 0){
            amount += 0;
        }else {
            amount += amountToPut;
        }
    }

    public void take(double amountToTake) {
        //TODO: реализуйте метод и удалите todo
        // метод списывает деньги со счета
        if ((amount - amountToTake) < 0){
            amount -= 0;
        }else {
            amount -= amountToTake;
        }
    }

}
