import java.io.*;

public class p08370 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] planes = br.readLine().split(" ");
        int [] seats = new int[planes.length];

        for (int i=0; i<planes.length; i++){
            seats[i] = Integer.parseInt(planes[i]);
        }

        System.out.println( (seats[0]*seats[1] + seats[2]*seats[3]));

    }
}