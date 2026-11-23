import java.util.*;

public class p120897 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120897
    // 약수 구하기
    // ----------------------------------------------------------------------

    public int[] solution(int n) {
        int count = 0;
        int[] answer = new int[n];

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[count] = i;
                count++;
            }
        }

        answer = Arrays.copyOfRange(answer, 0, count);
        return answer;
    }
}