public class p120824 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/120824
    // 짝수 홀수 개수
    // ----------------------------------------------------------------------

    public int[] solution(int[] num_list) {
        int even = 0;
        for (int num : num_list) {
            if (num % 2 == 0) even++;
        }
        return new int[]{even, num_list.length - even};
    }
}