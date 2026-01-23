import java.io.*;

public class p28235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.equals("SONGDO")) {
            System.out.print("HIGHSCHOOL");
        } else if (str.equals("CODE")) {
            System.out.print("MASTER");
        } else if (str.equals("2023")) {
            System.out.print("0611");
        } else if (str.equals("ALGORITHM")) {
            System.out.print("CONTEST");
        }
    }
}