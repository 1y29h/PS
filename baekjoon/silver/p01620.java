import java.io.*;
import java.util.*;

public class p01620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> poketmons = new HashMap<>();
        String [] poketmonsArr = new String[N];

        for (int i=1; i<=N; i++) {
            String name = br.readLine();
            poketmons.put(name, i);
            poketmonsArr[i-1] = name;
        }

        for (int i=0; i<M; i++) {
            String str = br.readLine();
            if (Character.isDigit(str.charAt(0))) {
                sb.append(poketmonsArr[Integer.parseInt(str)-1]).append("\n");
            } else {
                sb.append(poketmons.get(str)).append("\n");
            }
        }

        System.out.println(sb);

    }
}