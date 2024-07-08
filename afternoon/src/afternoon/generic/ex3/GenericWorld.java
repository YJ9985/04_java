package afternoon.generic.ex3;

public class GenericWorld<T extends Number> {
        private T number;
        private Double numberDouble;
        private String string;


    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public Double transDouble() {
        return number.doubleValue();

    }
    @Override
    public String toString() {
        return "GenericWorld{" +
                "number=" + number +
                '}';
    }
}
