import java.io.*;
import java.util.*;

public class Main {
    static class Balloon {
        int idx, val;
        Balloon(int i, int v) { idx = i; val = v; }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Balloon> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            dq.addLast(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        StringBuilder sb = new StringBuilder();

        while (!dq.isEmpty()) {
            Balloon cur = dq.pollFirst();
            sb.append(cur.idx).append(" ");

            if (dq.isEmpty()) break;

            int move = cur.val;
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    dq.addLast(dq.pollFirst());
                }
            } else {
                for (int i = 0; i < -move; i++) {
                    dq.addFirst(dq.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}