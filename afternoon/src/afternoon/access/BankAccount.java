package afternoon.access;

public class BankAccount {
    private int balance; //잔고

    public BankAccount() {
        this.balance = 0; //초기값은 무조건 0
    }

    //입금기능
    public void deposit(int amount) {
        if (isValidAmount(amount)) {
            this.balance += amount;
            System.out.println("Balance: " + this.balance);
        } else {
            System.out.println("Negative amount"); //0보다 작은 값을 입력하면 오류표시
        }
    }

    //출금기능
    public void withdraw(int amount) {
        if (isValidAmount(amount)) {
            if (isPossibleWithdraw(amount)) {
                this.balance -= amount;
                System.out.println("Balance:" + this.balance);
            } else {
                System.out.println("Balance is too small. Your balance is " + this.balance);
            }
        } else {
            System.out.println("Negative amount");
        }
    }

    //private인 balance를 외부에서도 접근 가능하게 할 메서드를 입력
    public void getBalance() {
        System.out.println("Balance: " + this.balance);
    }

    //매서드를 통해 amount 조건 걸기. 조건이 바뀌면 한 번에 모든 변경 가능하도록
    private boolean isValidAmount (int amount) {
        return amount > 0;
    }

    //출금 가능 여부 판단
    private boolean isPossibleWithdraw (int amount) {
        return this.balance >= amount;
    }
}
