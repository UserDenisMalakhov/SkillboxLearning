public class ArithmeticCalculator {
    private final int a;
    private final int b;

    public ArithmeticCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calculateSum(Operation operation){
        Operation sum = Operation.ADD;
        return a + b;
    }
    public int calculateSubtract(Operation operation){
        Operation sum = Operation.SUBTRACT;
        return a - b;
    }
    public int calculateMultiply(Operation operation){
        Operation sum = Operation.MULTIPLY;
        return a * b;
    }

    public int calculate(Operation operation) {
        switch (operation) {
            case ADD -> { return a + b;
            }
            case SUBTRACT -> {
                return a - b; }
            case MULTIPLY -> { return a * b;
            }
        }
        return 0;
    }
}
