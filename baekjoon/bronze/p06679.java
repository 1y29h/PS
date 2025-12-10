public class p06679 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int ten, twelve, sixteen;
        char ch;

        for (int i=1000; i<10000; i++) {

            String num = String.valueOf(i);
            ten = 0;
            for (int j=0; j<num.length(); j++) {
                ten += Integer.parseInt(String.valueOf(num.charAt(j)));
            }

            String two = Integer.toString(i, 12);
            twelve = 0;
            for (int j=0; j<two.length(); j++) {
                ch = two.charAt(j);
                if (ch >= '0' && ch <= '9') {
                    twelve += Integer.parseInt(String.valueOf(ch));
                } else {
                    twelve += Integer.parseInt(String.valueOf(ch-'a'+10));
                }
            }

            if (ten == twelve) {
                String six = Integer.toString(i, 16);
                sixteen = 0;
                for (int j=0; j<six.length(); j++) {
                    ch = six.charAt(j);
                    if (ch >= '0' && ch <= '9') {
                        sixteen += Integer.parseInt(String.valueOf(ch));
                    } else {
                        sixteen += Integer.parseInt(String.valueOf(ch-'a'+10));
                    }
                }
                if (twelve == sixteen) sb.append(i + "\n");
            }

        }

        System.out.println(sb);

    }
}