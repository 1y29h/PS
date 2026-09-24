import java.util.*;

public class p043236 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/43236
    // 징검다리
    // ----------------------------------------------------------------------

    public int solution(int distance, int[] rocks, int n) {
        List<Integer> rock = new ArrayList<>();
        int left = 0;
        int right = distance;
        int mid;
        int answer = 0;

        Arrays.sort(rocks);
        for (int i : rocks) rock.add(i);
        rock.add(distance);

        while (left <= right) {
            int leftRock = 0;
            int count = n;
            mid = (left + right) / 2;

            for (int i = 0; i < rock.size(); i++) {
                if (mid <= (rock.get(i) - leftRock)) leftRock = rock.get(i);
                else count--;

                if (count < 0) break;
            }

            if (count < 0) right = mid - 1;
            else {
                answer = mid;
                left = mid + 1;
            }
        }

        return answer;
    }
}