import java.io.*;

public class p28290 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        switch(str) {
            case "fdsajkl;":
                System.out.println("in-out");
                break;
            case "jkl;fdsa":
                System.out.println("in-out");
                break;
            case "asdf;lkj":
                System.out.println("out-in");
                break;
            case ";lkjasdf":
                System.out.println("out-in");
                break;
            case "asdfjkl;":
                System.out.println("stairs");
                break;
            case ";lkjfdsa":
                System.out.println("reverse");
                break;
            default:
                System.out.println("molu");
        }

    }
}