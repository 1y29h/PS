import java.io.*;

public class p02562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int max = 0;
        int index = 0;

        for (int i=1; i<=9; i++) {
            num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}