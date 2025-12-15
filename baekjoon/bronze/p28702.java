import java.io.*;

public class p28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        String str;

        for (int i=1; i<=3; i++) {
            str = br.readLine();
            if (!(str.equals("Fizz") || str.equals("Buzz") || str.equals("FizzBuzz"))) {
                num = Integer.parseInt(str) + (4-i);
                break;
            }
        }

        if (num%15==0) System.out.print("FizzBuzz");
        else if (num%3==0 && num%5!=0) System.out.print("Fizz");
        else if (num%5==0 && num%3!=0) System.out.print("Buzz");
        else System.out.print(num);

    }
}