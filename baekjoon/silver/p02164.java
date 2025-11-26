import java.io.*;
import java.util.*;

public class p02164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> Q = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            Q.add(i);
        }

        while(Q.size()>1) {
            Q.remove();
            int first = Q.poll();
            Q.add(first);
        }

        System.out.println(Q.poll());

    }
}