package afternoon.interfacee;

public class HumanMain {
    public static void main(String[] args) {
        Human[] humans = { new Korean(), new American(), new Spanish()};

        //동일한데 좀 더 긴 버전
//        Human[] humans = new Human[3];
//        humans[0] = new Korean();
//        humans[1] = new American();
//        humans[2] = new Spanish();

        for (Human h : humans) {
            HumanCall(h);
        }
    }

    public static void HumanCall(Human human) {
        human.speak();
        human.eat();
        human.hello();
    }
}
