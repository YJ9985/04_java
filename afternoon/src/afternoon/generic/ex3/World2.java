package afternoon.generic.ex3;

public class World2{
    public static void main(String[] args) {
        GenericWorld<Integer> integerWorld = new GenericWorld<>();
        integerWorld.setNumber(10);
        System.out.println(integerWorld.getNumber());

        GenericWorld<Long> LongWorld = new GenericWorld<>();
        LongWorld.setNumber(20L);
        System.out.println(LongWorld.getNumber());

        //GenericWorld<String>: 문제발생
    }
}
