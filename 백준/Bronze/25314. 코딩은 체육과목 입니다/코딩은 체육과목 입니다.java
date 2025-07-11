import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String hyea = "";
			int i = 0;
			for(i=1; i<=N/4; i++) {
				hyea += "long ";
			}
			hyea += "int";
			System.out.println(hyea);
	}
}
