import java.io.*;
import java.util.*;

public class p28447 {

    static int N, K, max;
    static int [][] C;
    static int [] resNum;
    static boolean [] useC;
    static boolean first = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (K==1) {
            System.out.println(0);
            return;
        }

        C = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                C[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        resNum = new int[K+1];
        useC = new boolean[N+1];
        useC[0] = true;
        deps(1,1);

        System.out.println(max);

    }

    public static void deps(int lev, int i) {

        for (int l=i; l<=N; l++) {
            if (useC[l] == false) {
                useC[l] = true;
                resNum[lev] = l;

                // 숫자 K개 다 뽑았다면
                if (lev == K) {
                    // 궁합 계산
                    int sum = 0;
                    for (int j=1; j<K; j++) {
                        for (int k=j+1; k<=K; k++) {
                            sum += C[resNum[j]][resNum[k]];
                        }
                    }
                    // max 초깃값을 0으로 할 경우 모든 궁합이 -일 때 계산 불가
                    // 따라서 첫 번째 sum은 max에 대입
                    if (first) {
                        max = sum;
                        first = false;
                    } else{
                        max = Math.max(max, sum);
                    }
                }

                else {
                    deps(lev+1, l+1);
                }

                useC[l] = false;

            }
        }
    }

}