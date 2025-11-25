import java.io.*;
import java.util.*;

public class p02493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] towers = new int[N];
        int [] res = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            towers[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i=N-1; i>0; i--) {
            while (!stack.isEmpty() && towers[i-1] >= towers[stack.peek()]) {
                res[stack.pop()] = i;
            }
            if (towers[i-1] >= towers[i]) {
                res[i] = i;
            } else {
                stack.push(i);
            }
        }

        for (int i=0; i<N; i++) {
            System.out.print(res[i] + " ");
        }

    }
}