package loop;

public class While3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum += i;
        System.out.println("i: " + i + " sum: " + sum);
        i++; //2

        sum += i; //1+2=3
        System.out.println("i: " + i + " sum: " + sum);
        i++; //3

        sum += i; //3+3=6
        System.out.println("i: " + i + " sum: " + sum);
        i++; //4
    }
}
