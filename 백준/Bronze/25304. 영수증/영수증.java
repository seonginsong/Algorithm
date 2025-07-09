import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int X = sc.nextInt();
			int N = sc.nextInt();
			int i = 0;
			int result = 0;
			for(i=1; i<=N; i++) {
				int a = sc.nextInt();			
				int b = sc.nextInt();			
				result += a * b;
			}
			if(X == result) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
	}
}
