import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int expected = 1;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek() == expected) {
                stack.pop();
                expected++;
            }

            if (num == expected) {
                expected++;
            } else {
                stack.push(num);
            }
        }

        while (!stack.isEmpty() && stack.peek() == expected) {
            stack.pop();
            expected++;
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}