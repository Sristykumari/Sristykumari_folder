import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean found = false;
		
		// Check factors from 2 to n-1
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				found = true;
			}
		}
		
		// If no factors found (prime number or 0/1)
		if (!found) {
			System.out.print(-1);
		}
		
		sc.close();
}
}
