import java.util.Scanner;

public class p02475 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String [] KOI = sc.nextLine().split(" ");
        int square = 0;
        int res = 0;

        for (int i = 0; i < KOI.length; i++) {
            square = Integer.parseInt(KOI[i]);
            res += square*square;
        }

        System.out.println(res%10);

    }
}