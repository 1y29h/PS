import java.util.*;

public class p042747 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42747
    // H-Index
    // ----------------------------------------------------------------------

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;

        for (int i = 0; i < len; i++) {
            if (citations[i] >= len - i) return len - i;
        }

        return 0;
    }
}