import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        String reversedA = new StringBuilder(a).reverse().toString();
        String reversedB = new StringBuilder(b).reverse().toString();
        
        int numA = Integer.parseInt(reversedA);
        int numB = Integer.parseInt(reversedB);
        
        System.out.println(Math.max(numA, numB));
        
        sc.close();
    }
}
