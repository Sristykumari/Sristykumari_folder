import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        // write the logic here !!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n-i+1){
                System.out.print(j);
                j= j+1;
            }
            System.out.println();
            i = i+1;
        }
        //  for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
