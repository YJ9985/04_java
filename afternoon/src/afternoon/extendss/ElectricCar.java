package afternoon.extendss;

//같은 package 내에서 extends 해서 import가 발생하지 않음
public class ElectricCar extends Car {
    @Override
    public void move(){
        System.out.println("전기차가 이동합니다.");
    }

    @Override
    public void openDoor(){
        System.out.println("전치가 문을 엽니다.");
    }

    public void charge() {
        System.out.println("전기차를 충전합니다.");
    }
}
