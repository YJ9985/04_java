package afternoon.access.refactor2;

import afternoon.access.refactor.AccountRefactor;

public class AccountRefactorOuterMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("신한은행", "VIP", "이예지", 1000000000);

        //public 요소 접근
        System.out.println(account.bank);

        //default 요소 접근: 같은 패키지 안에 있는게 아니라 default도 접근 불가
//        System.out.println(account.grade);
    }
}
