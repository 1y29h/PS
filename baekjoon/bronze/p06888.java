import java.io.*;

public class p06888 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        while (X<=Y) {
            sb.append("All positions change in year " + X).append("\n");
            X += 60;
        }

        System.out.println(sb);

    }
}