public class p042862 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    // 체육복
    // ----------------------------------------------------------------------

    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 1];
        int answer = 0;

        for (int i = 1; i <= n; i++) clothes[i]++;
        for (int i : lost) clothes[i]--;
        for (int i : reserve) clothes[i]++;

        for (int i = 1; i <= n; i++) {
            if (clothes[i] == 0) {
                if (i > 1 && clothes[i - 1] == 2) {
                    clothes[i - 1]--;
                    clothes[i]++;
                } else if (i != n && clothes[i + 1] == 2) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }

            if (clothes[i] >= 1) answer++;
        }

        return answer;
    }
}