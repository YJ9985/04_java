package afternoon.generic.ex2;

public class StrictBoxMain {
    public static void main(String[] args) {
        StrictGenericBox<Integer> integerStrictGenericBox = new StrictGenericBox<>();
        integerStrictGenericBox.setValue(10);

        StrictGenericBox<Double> doubleStrictGenericBox = new StrictGenericBox<>();
        doubleStrictGenericBox.setValue(10.0);

        StrictGenericBox<Float> floatStrictGenericBox = new StrictGenericBox<>();
        floatStrictGenericBox.setValue(10.0f);

        StrictGenericBox<Long> longStrictGenericBox = new StrictGenericBox<>();
        longStrictGenericBox.setValue(1L);


    }
}
