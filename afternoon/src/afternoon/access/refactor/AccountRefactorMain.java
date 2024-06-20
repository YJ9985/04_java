package afternoon.access.refactor;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account1 = new AccountRefactor("국민은행", "GOLD", "YJ", 10000000);

        //public 요소 접근
        System.out.println(account1.bank);

        //default 요소 접근
        System.out.println(account1.grade);

        //private 요소 접근: 불가능
//        System.out.println(account1.name);

    }
}
