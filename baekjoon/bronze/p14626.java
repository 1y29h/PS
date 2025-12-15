import java.io.*;

public class p14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int even = 1;
        int sum = 0;
        char num;

        for (int i=1; i<=str.length(); i++) {
            num = str.charAt(i-1);
            if (num == '*') {
                if (i%2 == 0) even = 3;
            }
            else {
                if (i%2 == 0) sum += 3 * Integer.parseInt(String.valueOf(num));
                else sum += Integer.parseInt(String.valueOf(num));
            }
        }

        for (int i=0; i<=9; i++) {
            if ((sum + even*i) % 10 == 0) {
                System.out.print(i);
                break;
            }
        }

    }
}