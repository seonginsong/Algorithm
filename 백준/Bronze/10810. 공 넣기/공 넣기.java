import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int M = sc.nextInt();
		
		for(int z = 0; z < M; z++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int x = i - 1; x < j; x++) {
				arr[x] = k;
			}
		}

		for(int y = 0; y < arr.length; y++) {
			System.out.print(arr[y] + " ");
		}
	}	
}
