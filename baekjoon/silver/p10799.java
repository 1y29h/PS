import java.io.*;

public class p10799 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int result = 0;
        int open = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                open--;
                if (input.charAt(i - 1) == '(') {
                    result += open;
                } else {
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}