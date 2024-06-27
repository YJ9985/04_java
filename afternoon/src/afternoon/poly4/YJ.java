package afternoon.poly4;

public class YJ implements Animal,Human{
    @Override
    public void eat() {
        System.out.println("YJ eats lunch");
    }

    @Override
    public void sleep() {
        System.out.println("YJ is sleeping");
    }

    @Override
    public void think() {
        System.out.println("YJ is thinking");
    }
}
