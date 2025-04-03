import java.util.Scanner;

public class p02744 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char [] s = sc.next().toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (Character.isUpperCase(s[i]))
                s[i] = Character.toLowerCase(s[i]);
            else
                s[i] = Character.toUpperCase(s[i]);
            System.out.print(s[i]);
        }

        sc.close();

    }
}