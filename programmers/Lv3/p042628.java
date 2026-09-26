import java.util.*;

public class p042628 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42628
    // 이중우선순위큐
    // ----------------------------------------------------------------------

    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (String str : operations) {
            StringTokenizer st = new StringTokenizer(str);
            String cal = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if (cal.equals("I")) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else if (!map.isEmpty()) {
                int key = (num == 1) ? map.lastKey() : map.firstKey();
                if (map.get(key) == 1) map.remove(key);
                else map.put(key, map.get(key) - 1);
            }
        }

        if (map.isEmpty()) return new int[2];
        return new int[]{map.lastKey(), map.firstKey()};
    }
}