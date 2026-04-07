import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append('\n');
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append('\n');
                    break;
                case "back":
                    sb.append(q.isEmpty() ? -1 : q.peekLast()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}