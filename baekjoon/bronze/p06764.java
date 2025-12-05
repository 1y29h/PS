import java.io.*;

public class p06764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] deps = new int[4];
        for (int i = 0; i < 4; i++) {
            deps[i] = Integer.parseInt(br.readLine());
        }

        int res = 0;
        for (int i = 1; i < 4; i++) {
            // Rising
            if ((deps[i-1] < deps[i]) && (res==0 || res==1)) {
                res = 1;
            }

            // Diving
            else if ((deps[i-1] > deps[i]) && (res==0 || res==2)) {
                res = 2;
            }

            // Constant
            else if ((deps[i-1] == deps[i]) && (res==0 || res==3)) {
                res = 3;
            }

            // No
            else {
                res = 4;
                break;
            }
        }

        if (res==1) System.out.print("Fish Rising");
        else if (res==2) System.out.print("Fish Diving");
        else if (res==3) System.out.print("Fish At Constant Depth");
        else System.out.print("No Fish");

    }
}