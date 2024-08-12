package construct;

public class ConstructorMain2 {
    public static void main(String[] args) {
        MemberConstructor member1 = new MemberConstructor("user1", 15, 90);
        MemberConstructor member2 = new MemberConstructor("user2", 16);

        MemberConstructor[] members = {member1, member2};

        for (MemberConstructor m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade );
        }
    }
}
