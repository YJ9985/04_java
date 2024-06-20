package afternoon.access;

public class AcoountMain {
    public static void main(String[] args) {
        Account account = new Account(10000);

        account.deposit(1000); //이자 입금
        account.withdraw(5000); //학식 출금

        System.out.println("계좌 잔고: " + account.balance);

    }
}
