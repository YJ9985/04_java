package afternoon.classs;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("이예지", 26, 1423564, false);
        customer1.printCustomer();

//        customer1.name = "이예지";
//        customer1.age = 26;
//        customer1.total=1424123;
//        customer1.isBlacklist = false;

        Customer customer2 = new Customer("아직 몰라요", 0, 0, false);
        customer2.printCustomer();
    }
}
