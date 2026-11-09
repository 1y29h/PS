public class p120831 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120831
    // 짝수의 합
    // ----------------------------------------------------------------------

    public int solution(int n) {
        int ans = 0;
        for (int i = 2; i <= n; i += 2) ans += i;
        return ans;
    }
}