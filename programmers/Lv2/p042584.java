import java.util.*;

public class p042584 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42584
    // 주식가격
    // ----------------------------------------------------------------------

    public int[] solution(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[prices.length];

        for (int k = 0; k < prices.length; k++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[k]) {
                int index = stack.pop();
                answer[index] = k - index;
            }

            stack.push(k);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = (prices.length - 1) - index;
        }

        return answer;
    }
}