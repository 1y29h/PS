import java.io.*;
import java.util.*;

public class p10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String order;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            order = st.nextToken();

            if (order.equals("push")) {
                stack.add(Integer.parseInt(st.nextToken()));
            }
            else if (order.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }
            else if (order.equals("size")) {
                System.out.println(stack.size());
            }
            else if (order.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            else if (order.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }

        }

    }
}