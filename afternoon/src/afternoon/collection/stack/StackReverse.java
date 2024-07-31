package afternoon.collection.stack;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String input = "Yeji Lee";

        char[] charArr = input.toCharArray(); //배열의 요소가 각각 나누어져서 저장됨
        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]); //배열에 값 하나씩 넣음
         }

        char[] reverseArr = new char[charArr.length];
        int i = 0;
        while(!stack.isEmpty()) {
            reverseArr[i++] = stack.pop(); //값이 거꾸로 들어감
        }

        String reverseStr = new String(reverseArr); //배열이였던 것을 String으로 전환

        System.out.println("input = " + input);
        System.out.println("reverseStr = " + reverseStr);
    }
}
