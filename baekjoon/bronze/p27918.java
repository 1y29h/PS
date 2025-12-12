import java.io.*;

public class p27918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int X = 0; int Y = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.equals("D")) X++;
            else Y++;

            if ((X>=Y+2)||(Y>=X+2)) break;
        }

        System.out.println(X + ":" + Y);

    }
}
