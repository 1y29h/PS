import java.util.*;

public class p042840 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    // 모의고사
    // ----------------------------------------------------------------------

    public int[] solution(int[] answers) {
        int[] scores = new int[3];

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) scores[0]++;
            if (answers[i] == second[i % second.length]) scores[1]++;
            if (answers[i] == third[i % third.length]) scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        int[] result = new int[3];
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) result[count++] = i + 1;
        }

        return Arrays.copyOf(result, count);
    }
}