import java.io.*;

public class p01296 {

    static int[] yGreenNum = new int[4];

    static int Probability(int[] count) {
        int L = yGreenNum[0] + count[0];
        int O = yGreenNum[1] + count[1];
        int V = yGreenNum[2] + count[2];
        int E = yGreenNum[3] + count[3];

        return ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E) % 100);
    }

    static int [] Count(String name) {
        int[] count = new int[4];
        char ch;

        for (int i=0; i<name.length(); i++) {
            ch = name.charAt(i);
            if (ch == 'L') count[0]++;
            else if (ch == 'O') count[1]++;
            else if (ch == 'V') count[2]++;
            else if (ch == 'E') count[3]++;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String yGreen = br.readLine();
        yGreenNum = Count(yGreen);

        int N = Integer.parseInt(br.readLine());
        String name;
        String win = "";
        int score = -1;
        int probability;

        for (int i=0; i<N; i++) {
            name = br.readLine();
            probability = Probability(Count(name));
            if ((probability > score) || ((probability == score) && win.compareTo(name) > 0)) {
                win = name;
                score = probability;
            }
        }

        System.out.println(win);

    }
}