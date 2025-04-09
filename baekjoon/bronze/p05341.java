import java.io.*;

public class p05341 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            int top = Integer.parseInt(br.readLine());
            int blocks = 0;

            if(top ==0){
                break;
            }

            for (int i=top; i>=1; i--){
                blocks += i;
            }

            System.out.println(blocks);
        }

    }
}
