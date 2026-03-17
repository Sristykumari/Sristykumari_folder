    import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        // write the logic here !!
   Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {

            // print spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int j = i; j <= N; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
        }

    }


