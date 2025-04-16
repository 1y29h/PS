import java.io.*;

public class p01267 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String [] secs = br.readLine().split(" ");

        int Yres = 0;
        int Mres = 0;

        for (String s : secs) {
            int t = Integer.parseInt(s);
            Yres += ((t/30)+1)*10;
            Mres += ((t/60)+1)*15;
        }

        if (Yres>Mres) System.out.println("M " + Mres);
        else if (Yres == Mres) System.out.println("Y M " + Mres);
        else System.out.println("Y " + Yres);

    }
}