import java.io.*;

public class p10173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            if (str.equals("EOI")) break;

            str = str.toUpperCase();
            if (str.contains("NEMO")) System.out.println("Found");
            else System.out.println("Missing");
        }

    }
}