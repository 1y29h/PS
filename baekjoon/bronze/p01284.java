import java.io.*;

public class p01284 {

    public static void margine(String N){

        int res = 1;
        char [] ch = N.toCharArray();

        for (int i = 0; i < N.length(); i++) {
            switch (ch[i]) {
                case '1':
                    res += 3;
                    break;
                case '0':
                    res += 5;
                    break;
                default:
                    res += 4;
                    break;
            }
        }

        System.out.println(res);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String N = br.readLine();
            if(Integer.parseInt(N)==0) break;
            margine(N);
        }

    }

}