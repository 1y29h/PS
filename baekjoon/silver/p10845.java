import java.io.*;
import java.util.*;

public class p10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String order;
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> q = new LinkedList<>();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            order = st.nextToken();

            if (order.equals("push")) {
                q.add(Integer.parseInt(st.nextToken()));
            }
            else if (order.equals("pop")) {
                System.out.println(q.isEmpty() ? -1 : q.poll());
            }
            else if (order.equals("size")) {
                System.out.println(q.size());
            }
            else if (order.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            }
            else if (order.equals("front")) {
                System.out.println(q.isEmpty() ? -1 : q.peek());
            }
            else {
                System.out.println(q.isEmpty() ? -1 : q.getLast());
            }

        }

    }
}