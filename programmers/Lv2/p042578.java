import java.util.*;

public class p042578 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42578
    // 의상
    // ----------------------------------------------------------------------

    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String kind = cloth[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        int res = 1;
        for (int num : map.values()) {
            res *= (num + 1);
        }

        return res - 1;
    }
}