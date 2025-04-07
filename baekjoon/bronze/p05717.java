import java.util.Scanner;

public class p05717 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] line;
        int M, F;

        while (true){

            line = sc.nextLine().split(" ");
            M = Integer.parseInt(line[0]);
            F = Integer.parseInt(line[1]);

            if (M == 0 && F == 0) break;
            System.out.println(M+F);

        }

    }
}