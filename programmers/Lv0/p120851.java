public class p120851 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120851
    // 숨어있는 숫자의 덧셈 (1)
    // ----------------------------------------------------------------------

    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if ('1' <= c && c <= '9') answer += c - '0';
        }

        return answer;
    }
}