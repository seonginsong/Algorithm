import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int i = 1;
			int result = 0;
			for(i=1; i<=n; i++) {
				result = result+i;
			}
			System.out.println(result);
	}

}
