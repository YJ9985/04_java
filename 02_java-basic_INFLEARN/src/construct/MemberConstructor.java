package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    MemberConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }

    MemberConstructor(String name, int age, int grade) {
        System.out.println("생성자 호출: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
