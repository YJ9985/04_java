package afternoon.lang.immutable.ex;

public class DateMain {
    public static void main(String[] args) {
        Date date1 = new Date(2024, 7, 1);
        Date date2 = date1;

        System.out.println("Change year of date2 to 2025");
        date2.setYear(2025);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
