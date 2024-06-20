package afternoon.pack;

import afternoon.pack.nouveau.Customer;

public class PackageFistMian {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        //기본적으로 같은 패키지에 있는 Customer를 불러오기 때문에 pack에 있는 Customer에 해당함

        //nouveau의 Customer를 부르고 싶으면?
        afternoon.pack.nouveau.Customer customer2 = new afternoon.pack.nouveau.Customer();

        //더 간단하게 표기하는 방법은?
        //import afternoon.pack.nouveau.Customer; 입력하면 됨.
        //다만 이때는 위,아래 모두 nouveau,Customer이니 유의할 것


    }
}
