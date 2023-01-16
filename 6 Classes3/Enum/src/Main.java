public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(1,2);
        System.out.println(arithmeticCalculator.calculateSum(Operation.ADD));
        System.out.println(arithmeticCalculator.calculateSubtract(Operation.SUBTRACT));
        System.out.println(arithmeticCalculator.calculateMultiply(Operation.MULTIPLY));
        System.out.println();
        System.out.println(arithmeticCalculator.calculate(Operation.MULTIPLY));
        System.out.println(arithmeticCalculator.calculate(Operation.SUBTRACT));

    }
}