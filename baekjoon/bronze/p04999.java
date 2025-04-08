import java.util.Scanner;

public class p04999 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String J = sc.nextLine();
        String D = sc.nextLine();

        if (J.length() >= D.length()){
            System.out.println("go");
        } else{
            System.out.println("no");
        }

    }
}