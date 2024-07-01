package afternoon.polyfinal.ex;

import java.util.Scanner;

public class Driver {
    private Car car;
    Scanner scanner = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }

    public void selectCar() {
        System.out.println("운전하고 싶은 차를 선택하세요. (1. K5 / 2. 그랜져 / 3. G70): ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                setCar(new K5Car());
                break;
            case 2:
                setCar(new Grand());
                break;
            case 3:
                setCar(new G70());
                break;
            default:
                System.out.println("없는 번호입니다.");
                return;
        }

        drive();
    }

    public void drive() {
        car.drive();
    }
}
