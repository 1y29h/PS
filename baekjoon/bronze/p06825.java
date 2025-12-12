import java.io.*;

public class p06825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float weight = Float.parseFloat(br.readLine());
        float height = Float.parseFloat(br.readLine());

        if (weight/height/height > 25) System.out.println("Overweight");
        else if (weight/height/height < 18.5) System.out.println("Underweight");
        else System.out.println("Normal weight");

    }
}