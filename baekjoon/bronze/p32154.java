import java.io.*;

public class p32154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        switch (N) {
            case 1:
                System.out.println(11);
                System.out.print("A B C D E F G H J L M");
                return;
            case 2:
                System.out.println(9);
                System.out.print("A C E F G H I L M");
                return;
            case 3:
                System.out.println(9);
                System.out.print("A C E F G H I L M");
                return;
            case 4:
                System.out.println(9);
                System.out.print("A B C E F G H L M");
                return;
            case 5:
                System.out.println(8);
                System.out.print("A C E F G H L M");
                return;
            case 6:
                System.out.println(8);
                System.out.print("A C E F G H L M");
                return;
            case 7:
                System.out.println(8);
                System.out.print("A C E F G H L M");
                return;
            case 8:
                System.out.println(8);
                System.out.print("A C E F G H L M");
                return;
            case 9:
                System.out.println(8);
                System.out.print("A C E F G H L M");
                return;
            case 10:
                System.out.println(8);
                System.out.print("A B C F G H L M");
                return;
        }

    }
}