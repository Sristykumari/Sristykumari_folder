import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		//Your code goes here
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        char last = (char)('A' + N - 1);

        for(int i = 1; i <= N; i++) {

            char start = (char)(last - i + 1);

            for(char ch = start; ch <= last; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
        sc.close();
}
}
