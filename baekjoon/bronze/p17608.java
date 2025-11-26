import java.io.*;
import java.util.*;

public class p17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int before = 0;

        for (int i=0; i<N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        while (!stack.isEmpty()) {
            int pop = stack.pop();
            if (pop > before) {
                before = pop;
                res ++;
            }
        }

        System.out.println(res);

    }
}