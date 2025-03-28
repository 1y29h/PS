import java.math.BigInteger;
import java.util.Scanner;

public class p02338 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        BigInteger A = new BigInteger(s.next());
        BigInteger B = new BigInteger(s.next());

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));

        s.close();

    }
}