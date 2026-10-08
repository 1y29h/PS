import java.util.*;

public class p043163 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/43163
    // 단어 변환
    // ----------------------------------------------------------------------

    public int solution(String begin, String target, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        Queue<String> q = new ArrayDeque<>();

        for (String word : words) map.put(word, 0);
        if (!map.containsKey(target)) return 0;

        q.offer(begin);

        while (!q.isEmpty()) {
            String word = q.poll();
            int answer = word.equals(begin) ? 0 : map.get(word);
            if (word.equals(target)) return answer;

            for (String str : words) {
                if (map.get(str) != 0) continue;

                int count = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (str.charAt(i) != word.charAt(i)) count++;
                    if (count > 1) break;
                }

                if (count == 1) {
                    map.put(str, answer + 1);
                    q.offer(str);
                }
            }
        }

        return 0;
    }
}