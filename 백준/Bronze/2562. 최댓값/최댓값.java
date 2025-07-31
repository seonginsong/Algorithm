import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 9;
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		int i = 0;
		for(i = 1; i < N; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(i = 0; i<N; i++) {
			if(arr[i] == max) {
				break;
			}
		}
		System.out.println(max);
		System.out.println(i+1);
	}	
}
