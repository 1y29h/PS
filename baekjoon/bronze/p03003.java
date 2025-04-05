import java.util.Scanner;

public class p03003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] white = sc.nextLine().split(" ");
        int [] chessWhite = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < white.length; i++) {
            System.out.print(chessWhite[i] - Integer.parseInt(white[i]) + " ");
        }

        sc.close();

    }
}d