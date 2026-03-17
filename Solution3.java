import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
               // write your code logic !!
      Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {

            // print from i to N
            for(int j = i; j <= N; j++) {
                System.out.print(j + " ");
            }

            // print from 1 to i-1
            for(int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
