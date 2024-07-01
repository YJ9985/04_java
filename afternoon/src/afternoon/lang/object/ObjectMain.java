package afternoon.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.ChildMethod();
        child.parentMethod();

        //child와 Parent 안에 둘다 toString method 없는데 실행 가능. 왜냐하면 둘다 묵시적으로 Object를 상속받기 때문
        System.out.println(child.toString());
        System.out.println(child);

        //주소값 프린트: toHexString은 10진수로 나오는 주솟값을 16진수로 바꾸어주는 역할을 한다.
        String ref1 = Integer.toHexString(child.hashCode());
        String ref2 = Integer.toHexString(System.identityHashCode(child));

        System.out.println("ref1 = " + ref1);
        System.out.println("ref2 = " + ref2);
        
        Parent[] objects = {new Parent(), new Child()};
        //상속관계가 아니면 Object 타입에 담으면 됨
        Object[] objects2 = {new Parent(), new Child(), new OtherClass()};

        Object[] objects3 = {new Parent(), new Child(), new OtherClass()};
        System.out.println(size(objects3));

    }

    public static int size(Object[] objects) {
        return objects.length;
    }
}
