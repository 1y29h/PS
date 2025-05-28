import java.io.*;

public class p24568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int res = first*8 + second*3;
        if (res >= 28) {
            System.out.println(res - 28);
        } else {
            System.out.println(0);
        }
    }
}