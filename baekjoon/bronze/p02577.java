import java.io.*;

public class p02577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 1;
        for (int i=0; i<3; i++) {
            num *= Integer.parseInt(br.readLine());
        }
        String ABC = String.valueOf(num);

        int [] res = new int [10];
        for (int i=0; i<ABC.length(); i++) {
            for (int j=0; j<10; j++) {
                if (ABC.charAt(i) == j+'0') {
                    res[j]++;
                    break;
                }
            }
        }

        for (int i=0; i<10; i++) {
            System.out.println(res[i]);
        }

    }
}