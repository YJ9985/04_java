package afternoon.lang.immutable;

public class RefMain {
    public static void main(String[] args) {
        User user1 = new User("예지");
        User user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2.setName("예원");
        System.out.println("user2 이름 변경 " + user2);

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

    }
}
