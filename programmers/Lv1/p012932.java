public class p12932 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/12932
    // 자연수 뒤집어 배열로 만들기
    // ----------------------------------------------------------------------

    public int[] solution(long n) {
        // 자릿수 구하기
        String str = String.valueOf(n);
        int length = str.length();

        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}