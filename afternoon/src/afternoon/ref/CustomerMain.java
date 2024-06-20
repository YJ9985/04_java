package afternoon.ref;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "YJ";
        System.out.println(customer1);

        Customer customer2 = null; //null은 의도된 빈 값을 의미한다
        System.out.println(customer2.name);
        //NullPointerException 오류 발생: 런타임에러(주솟값에 가봐야 알 수 있는 에러)

//        customer2 = customer1;
//        System.out.println(customer2.name);
//        System.out.println(customer1.name);
    }
}
