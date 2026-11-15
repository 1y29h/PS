public class p120836 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120836
    // 순서쌍의 개수
    // ----------------------------------------------------------------------

    public int solution(int n) {
        int result = 0;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) result++;
            else if (n % i == 0) result += 2;
        }

        return result;
    }
}