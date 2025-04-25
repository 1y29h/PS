import java.io.*;

public class p22966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int compare = 4;
        String title = "";

        for (int i = 0; i < N; i++) {
            String [] split = br.readLine().split(" ");
            if (Integer.parseInt(split[1]) <= compare) {
                compare = Integer.parseInt(split[1]);
                title = split[0];
            }
        }

        System.out.println(title);

    }
}