import java.util.*;

public class p042884 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42884
    // 단속카메라
    // ----------------------------------------------------------------------

    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);

        int camera = -30001;
        int answer = 0;

        for (int[] route : routes) {
            if (camera < route[0]) {
                answer++;
                camera = route[1];
            }
        }

        return answer;
    }
}