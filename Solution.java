import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if (a >= b && a >= c) {
        //     System.out.println(a);
        // } else if (b >= a && b >= c) {
        //     System.out.println(b);
        // } else {
        //     System.out.println(c);
        // }
        
        // int X = sc.nextInt();
        // int Y = sc.nextInt();
        // int Z = sc.nextInt();

        // // Check triangle existence
        // if (X + Y <= Z || X + Z <= Y || Y + Z <= X) {
        //     System.out.println("Not a Triangle");
        // }
        // else {
        //     // Triangle exists, now classify
        //     if (X == Y && Y == Z) {
        //         System.out.println("Equilateral Triangle");
        //     }
        //     else if (X == Y || Y == Z || X == Z) {
        //         System.out.println("Isosceles Triangle");
        //     }
        //     else {
        //         System.out.println("Scalene Triangle");
        //     }
        // }  
        // int age = sc.nextInt();
        // double income = sc.nextDouble();
        // boolean hasLoan = sc.nextBoolean();

        // if (age >= 18 && income >= 2000 && hasLoan == false) {
        //     System.out.println("You are eligible for the loan.");
        // } else {
        //     System.out.println("You are not eligible for the loan.");
        // }
         int basic = sc.nextInt();
        char grade = sc.next().charAt(0);

        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        double pf = 0.11 * basic;

        int allow;
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double totalSalary = basic + hra + da + allow - pf;

        // Round off and print integer value
        System.out.println(Math.round(totalSalary));

        sc.close();
    }
}
