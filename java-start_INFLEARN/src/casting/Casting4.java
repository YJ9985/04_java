package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; //1.5>1로 나옴
        System.out.println(div1); //1

        double div2 = 3 / 2; //
        System.out.println(div2); //1.0

        double div3 = 3.0 / 2;
        System.out.println(div3); //1.5

        double div4 = (double) 3 / 2;
        System.out.println(div4); //1.5
    }
}
