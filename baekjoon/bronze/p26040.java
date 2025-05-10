import java.io.*;

public class p26040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String [] A = br.readLine().split("");
        String [] B = br.readLine().split(" ");

        for (int i=0; i<B.length; i++) {
            for (int j=0; j<A.length; j++) {
                if (B[i].equals(A[j])) {
                    char c = A[j].charAt(0);
                    c = Character.toLowerCase(c);
                    A[j] = String.valueOf(c);
                }
            }
        }

        for (int i=0; i<A.length; i++) {
            sb.append(A[i]);
        }

        System.out.println(sb);

    }
}