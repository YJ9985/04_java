package afternoon.lang.wrapper;

public class CompareMain {
    public static void main(String[] args) {
        //1.
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(2);

        System.out.println(a.compareTo(b));

        //2.
        Integer integer1 = new Integer(1);
        Integer integer2 = Integer.valueOf(2);

        Long long1 = Long.valueOf(100);
        Double double1 = Double.valueOf(100.12);

        System.out.println(integer1.intValue());
        System.out.println(integer2.intValue());
        System.out.println(long1.longValue());
        System.out.println(double1.doubleValue());
    }
}
