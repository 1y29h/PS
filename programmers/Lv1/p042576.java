import java.util.*;

public class p042576 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42576
    // 완주하지 못한 선수
    // ----------------------------------------------------------------------

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : participant) {
            if (!map.containsKey(name) || map.get(name) < 1) return name;
            else map.put(name, map.get(name) - 1);
        }

        return "";
    }
}