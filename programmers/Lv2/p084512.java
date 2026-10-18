public class p084512 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/84512
    // 모음사전
    // ----------------------------------------------------------------------

    public int solution(String word) {
        String alphabet = "AEIOU";
        int[] weight = {781, 156, 31, 6, 1};

        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            int index = alphabet.indexOf(word.charAt(i));
            answer += weight[i] * index + 1;
        }

        return answer;
    }
}