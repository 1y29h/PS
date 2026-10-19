import java.util.*;

public class p042895 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42895
    // N으로 표현
    // ----------------------------------------------------------------------

    public int solution(int N, int number) {
        HashSet<Integer>[] dp = new HashSet[9];
        int repeated = 0;

        for (int i = 1; i < 9; i++) {
            dp[i] = new HashSet<>();

            repeated = repeated * 10 + N;
            dp[i].add(repeated);

            for (int j = 1; j < i; j++) {

                for (int f : dp[j]) {
                    for (int s : dp[i - j]) {
                        dp[i].add(f + s);
                        dp[i].add(f - s);
                        dp[i].add(f * s);

                        if (s != 0) dp[i].add(f / s);
                    }
                }

            }

            if (dp[i].contains(number)) return i;
        }

        return -1;
    }
}