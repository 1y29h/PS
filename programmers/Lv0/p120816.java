public class p120816 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120816
    // 피자 나눠 먹기 (3)
    // ----------------------------------------------------------------------

    public int solution(int slice, int n) {
        if (n % slice != 0) return n / slice + 1;
        else return n / slice;
    }
}