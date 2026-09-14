public class p120884 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120884
    // 치킨 쿠폰
    // ----------------------------------------------------------------------

    public int solution(int chicken) {
        int answer = chicken / 9;
        if ((chicken % 9 == 0) && (chicken != 0)) answer--;

        return answer;
    }
}