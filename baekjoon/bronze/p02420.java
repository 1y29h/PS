import java.util.Scanner;

public class p02420 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String[] str = s.nextLine().split(" ");
        long N = Integer.parseInt(str[0]);
        long M = Integer.parseInt(str[1]);

        System.out.println(Math.abs(N-M));

        s.close();

    }
}
