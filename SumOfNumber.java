import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2; // Using the formula for the sum of the first n natural numbers
        System.out.println("Sum: " + sum);
        int i, sum2 = 0;
        for(i = 1; i <= n; i++) {
            sum2 += i;
            System.out.println("Current sum after adding " + i + ": " + sum2);
        }       
    
        System.out.println("Sum: " + sum);
        int num1 = 10;
        int num2 = 20;
        int sum3 = num1 + num2;
        System.out.println("Sum: " + sum3);
        if(sum2 > sum) {
            System.out.println("Sum2 is greater than Sum");
        } else {
            System.out.println("Sum is greater than or equal to Sum2");
        }
        sc.close();

    }   
}
