import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();

            if (Character.isDigit(query.charAt(0))) {
                int idx = Integer.parseInt(query);
                sb.append(arr[idx]).append('\n');
            } else {
                sb.append(map.get(query)).append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
