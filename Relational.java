import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // // Relational operators
        // System.out.println("a == b: " + (a == b)); // false
        // System.out.println("a != b: " + (a != b)); // true
        // System.out.println("a > b: " + (a > b));   // false
        // System.out.println("a < b: " + (a < b));   // true
        // System.out.println("a >= b: " + (a >= b)); // false
        // System.out.println("a <= b: " + (a <= b)); // true
        // System.out.println("a = b: " + (a = b));   // assignment, outputs 20
        // System.out.println("New value of a: " + a); // outputs 20

        // boolean result = (a == b); // true, since a is now 20
        // System.out.println("result: " + result); // true
        // boolean IS_ACTIVE = (a != b); // false
        // System.out.println("IS_ACTIVE: " + IS_ACTIVE); // false
        // boolean bIsNotGreater = (a > b); // false
        // System.out.println("bIsNotGreater: " + bIsNotGreater); // false

        // boolean isLessOrEqual = (a <= b); // true
        // System.out.println("isLessOrEqual: " + isLessOrEqual); // true


        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int marks = sc.nextInt();

        if (age >= 0 && age <= 4) {
            System.out.println("Infants");
        } else if (age >= 5 && age <= 12) {
            System.out.println("Children");
        } else if (age >= 13 && age <= 64) {
            System.out.println("Adults");
        } else {
            System.out.println("Seniors");
        }
       if(marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();

        
    }
}
