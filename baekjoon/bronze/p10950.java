import java.io.*;

public class p10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String [] AB = br.readLine().split(" ");
            sb.append(Integer.parseInt(AB[0])+Integer.parseInt(AB[1])+"\n");
        }

        System.out.println(sb);

    }
}