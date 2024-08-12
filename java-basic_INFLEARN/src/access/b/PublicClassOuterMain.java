package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

//          다른 패키지에서 접근 불가
//        DefaultCalss defaultCalss = new DefaultCalss();
//        DefaultCalss2 defaultCalss2 = new DefaultCalss2();
    }
}
