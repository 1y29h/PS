public class p012909 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/12909
    // 올바른 괄호
    // ----------------------------------------------------------------------

    boolean solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            else count--;

            if (count < 0) return false;
        }

        return count == 0;
    }
}