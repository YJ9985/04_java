package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA  = new Data();
        dataA.value = 10;
        Data dataB  = dataA;

        System.out.println("dataA 참조값= " + dataA);
        System.out.println("dataB 참조값= " + dataB);

        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA변경
        dataA.value = 30;
        System.out.println("dataA.value 변경");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB 변경
        dataB.value = 40;
        System.out.println("dataB.value 변경");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);


    }
}