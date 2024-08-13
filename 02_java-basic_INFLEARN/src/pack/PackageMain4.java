package pack;

import pack.a.User;

public class PackageMain4 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //import는 하나만 가능, 이름 같은거 하나 쓰면 하나는 풀로 다 적어저야 함
    }
}
