package afternoon.access.refactor;

public class AccountRefactor {
    public String bank; //은행명
    String grade; //회원등급
    private String name; //계좌 소유주
    private int balance; //계좌 잔고

    public AccountRefactor(String bank, String grade, String name, int balance) {
        this.bank = bank;
        this.grade = grade;
        this.name = name;
        this.balance = balance;
    }

}
