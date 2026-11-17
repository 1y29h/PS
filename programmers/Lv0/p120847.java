public class p120847 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120847
    // 최댓값 만들기(1)
    // ----------------------------------------------------------------------

    public int solution(int[] numbers) {
        int m1 = 0;
        int m2 = 0;

        for (int num : numbers) {
            if (num > m1) {
                m2 = m1;
                m1 = num;
            } else if (num > m2) m2 = num;
        }

        return m1 * m2;
    }
}