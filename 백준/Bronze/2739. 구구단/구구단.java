import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int i =1;
			for(i=1; i<10; i++) {
				int result = N*i;
				System.out.println(N+" * "+i+" = "+result);
			}
	}

}
