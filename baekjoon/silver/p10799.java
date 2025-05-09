import java.io.*;

public class p10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] parentheses = br.readLine().toCharArray();

        // 아직 닫히지 않은 막대
        int open = 0;
        // 전체 막대 개수
        int total = 0;

        for (int i = 0; i < parentheses.length; i++) {

            // (인 경우
            if (parentheses[i] == '(') {
                open++;
                total++;
            }

            // )인 경우
            else {
                // 레이저인 경우
                if (parentheses[i-1] == '(') {
                    open--;
                    total = open + total - 1;
                }
                // 막대가 완성된 경우
                else {
                    open--;
                }
            }

        }

        System.out.println(total);

    }
}