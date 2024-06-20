package afternoon.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100);
        account.deposit(200);

        account.getBalance();
        //error
        account.deposit(-399);

        //출금
        account.withdraw(100);

        //error
        account.withdraw(-200);
        account.withdraw(30000);

        account.getBalance();

    }
}
