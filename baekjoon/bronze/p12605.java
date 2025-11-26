import java.io.*;
import java.util.*;

public class p12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            Stack<String> stack = new Stack<>();

            while (st.hasMoreTokens()) {
                stack.push(st.nextToken());
            }

            sb.append("Case #" + i + ": ");
            while (!stack.isEmpty()) {
                sb.append(stack.pop() + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}