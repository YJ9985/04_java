package afternoon.access;

public class Account {
    int balance = 0; //잔고

    Account(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount; //입금
    }

    void withdraw(int amount) {
        balance -= amount; //출금
    }

}
