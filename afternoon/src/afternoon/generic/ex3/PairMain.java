package afternoon.generic.ex3;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, String> nameData = new Pair<>("이예지", "name");
        Pair<Integer, String> ageData = new Pair<>(26, "age");
        Pair<Boolean, String> marriedData = new Pair<>(false, "married");

        System.out.println(nameData);
        System.out.println(ageData);
        System.out.println(marriedData);
    }
}
