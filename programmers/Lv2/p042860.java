public class p042860 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42860
    // 조이스틱
    // ----------------------------------------------------------------------

    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = len - 1;

        for (int i = 0; i < len; i++) {
            char alphabet = name.charAt(i);
            answer += Math.min(alphabet - 'A', 'Z' - alphabet + 1);

            int A = i + 1;
            while (A < len && name.charAt(A) == 'A') A++;

            move = Math.min(move, i * 2 + len - A);
            move = Math.min(move, (len - A) * 2 + i);
        }

        return answer + move;
    }
}