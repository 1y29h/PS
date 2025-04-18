import java.io.*;

public class p01547 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        int ball = 1;

        for (int i=0; i<caseNum; i++){
            String [] change = br.readLine().split(" ");

            if (Integer.parseInt(change[0])==ball){
                ball = Integer.parseInt(change[1]);
            } else if (Integer.parseInt(change[1])==ball){
                ball = Integer.parseInt(change[0]);
            }

        }

        System.out.println(ball);

    }
}
