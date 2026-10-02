import java.util.*;

public class p042885 {
    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42885
    // 구명보트
    // ----------------------------------------------------------------------

    public int solution(int[] people, int limit) {
        int fir = 0;
        int sec = people.length - 1;
        int answer = 0;

        Arrays.sort(people);

        while (fir < sec) {
            if (people[fir] + people[sec] <= limit) fir++;
            sec--;
            answer++;
        }

        if (fir == sec) answer++;
        return answer;
    }
}