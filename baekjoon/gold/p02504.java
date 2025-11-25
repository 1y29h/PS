import java.io.*;
import java.util.Stack;

public class p02504 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] chars = str.toCharArray();

        int start = 0;
        int end = 0;
        int res = 0;

        int[] value = new int[chars.length];
        Stack<Integer> bracketsIndex = new Stack<>();
        Stack<Character> brackets = new Stack<>();
        Stack<Integer> valueIndex = new Stack<>();

        for (int i = 0; i < chars.length; i++) {

            // '(' 또는 '['일 때
            if ((chars[i] == '(') || (chars[i] == '[')) {
                start++;
                bracketsIndex.push(i);
                brackets.push(chars[i]);
            }

            // ')' 또는 ']'일 때
            else {
                end++;

                // 잘못된 괄호일 때
                if (start < end || (brackets.peek() == '(' && chars[i] == ']') || (brackets.peek() == '[' && chars[i] == ')')) {
                    res = 0;
                    break;
                }

                // 중첩된 괄호일 때
                if (valueIndex.isEmpty()) {
                    if (chars[i] == ')') {
                        value[i] = 2;
                    } else {
                        value[i] = 3;
                    }
                    valueIndex.push(i);
                } else {
                    int temp = 1;
                    if (bracketsIndex.peek() <= valueIndex.peek()) temp = 0;
                    while (!valueIndex.isEmpty() && (bracketsIndex.peek() <= valueIndex.peek())) {
                        temp += value[valueIndex.pop()];
                    }
                    if (chars[i] == ')') {
                        value[i] = temp * 2;
                    } else {
                        value[i] = temp * 3;
                    }
                    valueIndex.push(i);
                }

                // 모든 괄호가 닫혔을 때
                if (start == end) {
                    res += value[i];
                    start = 0;
                    end = 0;
                }

                bracketsIndex.pop();
                brackets.pop();

            }

        }

        // 잘못된 괄호일 때
        if (start != 0) res = 0;
        System.out.println(res);

    }
}