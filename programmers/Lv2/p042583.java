import java.util.*;

public class p042583 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42583
    // 다리를 지나는 트럭
    // ----------------------------------------------------------------------

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int index = 0;
        Queue<int[]> cross = new ArrayDeque<>();
        int cross_weight = 0;

        while (index < truck_weights.length) {
            answer++;

            if (!cross.isEmpty() && cross.peek()[1] == answer) {
                cross_weight -= cross.poll()[0];
            }

            if (cross.size() < bridge_length && cross_weight + truck_weights[index] <= weight) {
                cross.offer(new int[]{
                        truck_weights[index],
                        answer + bridge_length
                });
                cross_weight += truck_weights[index];
                index++;
            }
        }

        answer += bridge_length;
        return answer;
    }
}