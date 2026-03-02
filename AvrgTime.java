import java.util.Scanner;

public class AvrgTime {

	public static void main(String[] args) {
		// Write your code here
       Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int count = 0;   // how many valid terms printed
		int n = 1;       // starting value of N
		
		while (count < x) {
			
			int term = 3 * n + 2;
			
			if (term % 4 != 0) {   // exclude multiples of 4
				System.out.print(term + " ");
				count++;
			}
			
			n++;
		}
		
		sc.close();
	}

}
