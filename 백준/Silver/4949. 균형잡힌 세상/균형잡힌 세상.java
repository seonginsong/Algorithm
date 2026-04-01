import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean ok = true;

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') stack.push(c);
                else if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        ok = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        ok = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) ok = false;
            sb.append(ok ? "yes" : "no").append("\n");
        }

        System.out.print(sb);
    }
}