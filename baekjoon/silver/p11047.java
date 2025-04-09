import java.io.*;

public class p11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int N = Integer.parseInt(first[0]);
        int K = Integer.parseInt(first[1]);
        int [] nums = new int[N];
        int result = 0;

        for (int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i=(N-1); i>=0; i--){
            while(K - nums[i]>=0){
                K -= nums[i];
                result += 1;
            }
        }

        System.out.println(result);

    }
}