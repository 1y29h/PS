import java.util.Scanner;

public class p04101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] line;
        int A, B;

        while (true){

            line = sc.nextLine().split(" ");
            A = Integer.parseInt(line[0]);
            B = Integer.parseInt(line[1]);

            if (A == 0 && B == 0) break;
            if (A>B) System.out.println("Yes");
            else System.out.println("No");

        }

    }
}