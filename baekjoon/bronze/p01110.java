import java.io.*;

public class p01110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = N;
        int count = 0;

        while (true) {
            num = cycle(num);
            count++;
            if (num == N) break;
        }

        System.out.println(count);

    }

    public static int cycle(int num){

        int portion = num / 10;
        int remainder = num % 10;
        int sum = portion + remainder;
        return remainder*10 + sum%10;

    }

}