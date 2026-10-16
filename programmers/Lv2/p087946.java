public class p087946 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/87946
    // 피로도
    // ----------------------------------------------------------------------

    boolean[] used;
    int[][] dungeons;
    int answer;

    public void explore(int fatigue, int count) {
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] > fatigue || used[i]) continue;

            used[i] = true;
            explore(fatigue - dungeons[i][1], count + 1);
            used[i] = false;
        }
    }

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        used = new boolean[dungeons.length];

        explore(k, 0);

        return answer;
    }
}