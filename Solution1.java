import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();  // Start Fahrenheit
		int E = sc.nextInt();  // End Fahrenheit
		int W = sc.nextInt();  // Step size
		
		for (int f = S; f <= E; f = f + W) {
			
			// Formula: C = (5/9) * (F - 32)
			int c = (int)((5.0 / 9) * (f - 32));  // type casting
			
			System.out.println(f + " " + c);
		}
		
		sc.close();
	}

}
