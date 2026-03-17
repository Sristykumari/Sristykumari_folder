import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        // write the logic here !!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            // 1. Print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // 2. Increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num = num + 1;
            }

            // 3. Decreasing numbers
            num = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num = num-1;
            }

            System.out.println();
        }
        sc.close();
    }}
