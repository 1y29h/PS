import java.util.*;

public class p042746 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42746
    // 가장 큰 수
    // ----------------------------------------------------------------------

    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        List<String> sorted = new ArrayList<>();

        for (int num : numbers) sorted.add(Integer.toString(num));
        sorted.sort((a, b) -> (b + a).compareTo(a + b));

        if (sorted.get(0).equals("0")) return "0";
        for (String num : sorted) sb.append(num);
        return sb.toString();
    }
}