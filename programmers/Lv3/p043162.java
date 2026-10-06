import java.util.*;

public class p043162 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/43162
    // 네트워크
    // ----------------------------------------------------------------------

    int[] network;

    public int find(int index) {
        if (network[index] == index) return index;
        return network[index] = find(network[index]);
    }

    public void connect(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) network[b] = a;
    }

    public int solution(int n, int[][] computers) {
        network = new int[n];
        for (int i = 0; i < n; i++) network[i] = i;

        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (computers[i][k] == 1) {
                    connect(i, k);
                }
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(find(i));

        return set.size();
    }
}