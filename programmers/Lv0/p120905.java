import java.util.*;

public class p120905 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120905
    // n의 배수 고르기
    // ----------------------------------------------------------------------

    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int index = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[index] = numlist[i];
                index++;
            }
        }

        return Arrays.copyOf(answer, index);
    }
}