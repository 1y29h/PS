import java.io.*;

public class p28691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ch = br.readLine().charAt(0);

        if (ch == 'M') System.out.print("MatKor");
        else if (ch == 'W') System.out.print("WiCys");
        else if (ch == 'C') System.out.print("CyKor");
        else if (ch == 'A') System.out.print("AlKor");
        else if (ch == '$') System.out.print("$clear");
    }
}