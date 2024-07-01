package afternoon.lang.object;

public class Child extends Parent {
    private String name = "child";
    private int age = 20;

    public void ChildMethod() {
        System.out.println("Child.ChildMethod");
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
