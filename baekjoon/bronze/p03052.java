import java.io.*;
import java.util.*;

public class p03052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int [10];
        int res = 1;

        for (int i=0; i<10; i++) {
            num[i] = Integer.parseInt(br.readLine())%42;
        }
        Arrays.sort(num);

        for (int i=0; i<9; i++) {
            if (num[i] != num[i+1]) res++;
        }

        System.out.println(res);

    }
}