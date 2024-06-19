package ch02.sec06;

public class TextBlockEx {
    public static void main(String[] args) {
        String str1 =
                "{\n" + "\t\"id\":\"winter\",\n" +
                        "\t\"name\":\"snowflake\"\n" +
                        "}";

        String str2 =
        """
        {
        "id":"winter",
        "name":"snowflake"
        }
        """;

        System.out.println(str1);
        System.out.println("--------------------------");
        System.out.println(str2);
        System.out.println("--------------------------");

    }
}
