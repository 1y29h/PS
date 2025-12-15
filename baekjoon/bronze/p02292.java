import java.io.*;

public class p02292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int rooms = 1;
        int nums = 1;

        while (nums < N) {
            nums += rooms*6;
            rooms ++;
        }

        System.out.print(rooms);

    }
}