import java.io.*;

public class p30224 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] str = br.readLine().split("");
        String string = "";
        int parse = 0;
        int contain = 0;

        for (int i = 0; i < str.length; i++) {
            string += str[i];
            if (Integer.parseInt(str[i])==7) {
                contain ++;
            }
        }

        if (Integer.parseInt(string)%7==0) {
            parse++;
        }

        if ((contain==0)&&(parse==0)) System.out.println(0);
        else if ((contain==0)&&(parse==1)) System.out.println(1);
        else if ((contain>0)&&(parse==0)) System.out.println(2);
        else System.out.println(3);

    }
}
