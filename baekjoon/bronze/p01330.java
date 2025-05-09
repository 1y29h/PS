import java.util.*;
import java.io.*;

public class p01330 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String [] str = s.nextLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        if (A>B)
            System.out.println(">");
        else if (A<B)
            System.out.println("<");
        else
            System.out.println("==");

        s.close();

    }
}