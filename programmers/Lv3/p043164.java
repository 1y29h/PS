import java.util.*;

public class p043164 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/43164
    // 여행경로
    // ----------------------------------------------------------------------

    HashMap<String, Queue<String>> map = new HashMap<>();
    String[] answer;
    int index;

    public void trip(String src) {
        Queue<String> q = map.get(src);

        while (q != null && !q.isEmpty()) trip(q.poll());

        answer[index--] = src;
    }

    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length + 1];
        index = tickets.length;

        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });

        for (String[] ticket : tickets) {
            map.putIfAbsent(ticket[0], new ArrayDeque<>());
            map.get(ticket[0]).offer(ticket[1]);
        }

        trip("ICN");
        return answer;
    }
}