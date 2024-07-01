package afternoon.lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("John Doe");
        ImmutableUser user2 = user1;

        System.out.println("user1= " + user1);
        System.out.println("user2= " + user2);

        user2 = new ImmutableUser("YJ");
        System.out.println("User1 name change");
        System.out.println("user1= " + user1);
        System.out.println("user2= " + user2);


    }
}
