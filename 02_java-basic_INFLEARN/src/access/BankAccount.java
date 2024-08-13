package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public 메서드
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
