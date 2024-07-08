package afternoon.generic.ex3;

public class World1 {
    public static void main(String[] args) {
        IntegerWorld integerWorld = new IntegerWorld();
        integerWorld.setNumber(10);
        System.out.println(integerWorld.getNumber());

        IntegerWorld integerWorld2 = new IntegerWorld();
        integerWorld2.setNumber(4);
        System.out.println(integerWorld2.getNumber());

        LongWorld longWorld = new LongWorld();
        longWorld.setNumber(10L);
        System.out.println(longWorld.getNumber());
    }
}
