import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine();
            int count = 0;
            boolean valid = true;

            for (char c : s.toCharArray()) {
                if (c == '(') count++;
                else {
                    count--;
                    if (count < 0) {
                        valid = false;
                        break;
                    }
                }
            }

            if (count != 0) valid = false;
            sb.append(valid ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}