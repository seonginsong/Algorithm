import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int M = sc.nextInt();
		
		for(int z = 0; z < N; z++) {
			arr[z] = z+1;
		}
		
		for(int z = 0; z < M; z++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		for(int y = 0; y < arr.length; y++) {
			System.out.print(arr[y] + " ");
		}
	}	
}
