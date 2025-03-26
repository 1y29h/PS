import java.math.BigInteger;
import java.util.Scanner;

public class p01271 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String [] str = s.nextLine().split(" ");
        BigInteger n = new BigInteger(str[0]);
        BigInteger m = new BigInteger(str[1]);

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

        s.close();

    }
}