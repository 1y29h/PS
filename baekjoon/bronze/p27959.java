import java.io.*;

public class p27959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] NM = br.readLine().split(" ");

        if (Integer.parseInt(NM[0])*100 >= Integer.parseInt(NM[1])) System.out.println("Yes");
        else System.out.println("No");

    }
}