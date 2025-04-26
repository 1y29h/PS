import java.io.*;

public class p10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] AB = br.readLine().split(" ");
        System.out.println(Integer.parseInt(AB[0])*Integer.parseInt(AB[1]));

    }
}