package afternoon.extendss;

public class GasCar extends Car {
    @Override //부모요소랑 동일한 매서드가 있을 때, 적어줌. 매서드명이 동일해야 함
    public void move(){
        System.out.println("기름차가 이동합니다.");
    }

    @Override
    public void openDoor(){
        System.out.println("기름차 문을 엽니다");
    }
    public void fillUp() {
        System.out.println("가스차가 주유합니다.");
    }


}
