package afternoon.classs;

public class Customer {
    String name;
    int age;
    int total;
    boolean isBlacklist;

    //초기값 지정하는 단계
    Customer () {
        this.name = "아직 몰라요";
        this.age = 0;
        this.total = 0;
        this.isBlacklist = false;
    }


    Customer (String name, int age, int total, boolean isBlacklist) {
        this.name = name;
        this.age = age;
        this.total = total;
        this.isBlacklist = isBlacklist;
    }

    void printCustomer() {
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer Age: " + this.age);
        System.out.println("Customer Total: " + this.total);
        System.out.println("BlackList?: " + this.isBlacklist);
    }
}
