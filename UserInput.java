import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total marks: ");
        float totalMarks = sc.nextFloat();

        System.out.print("Enter marks scored: ");
        int scored = sc.nextInt();

        double percentage = (scored * 100.0) / totalMarks;
        System.out.println("Percentage: " + percentage + "%");

        // Static values
        float totalMarks1 = 800f;
        int scored1 = 240;

        double percentage1 = (scored1 * 100.0) / totalMarks1;
        System.out.println("Percentage: " + percentage1 + "%");

        sc.close();
    }
}
