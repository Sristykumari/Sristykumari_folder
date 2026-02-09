import java.util.Scanner;
public class Loops {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while loop
        int j = 1;
        while (j <= n) {
            System.out.println(j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= n);

        sc.close();
    }
    
}
