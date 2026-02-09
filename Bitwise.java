import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
    //     int a = 5;  // In binary: 0101
    //     int b = 3;  // In binary: 0011

    //     // Bitwise AND
    //     int andResult = a & b; // Result: 0001 (1 in decimal)
    //     System.out.println("Bitwise AND of " + a + " & " + b + " = " + andResult);

    //     // Bitwise OR
    //     int orResult = a | b; // Result: 0111 (7 in decimal)
    //     System.out.println("Bitwise OR of " + a + " | " + b + " = " + orResult);

    //     // Bitwise XOR
    //     int xorResult = a ^ b; // Result: 0110 (6 in decimal)
    //     System.out.println("Bitwise XOR of " + a + " ^ " + b + " = " + xorResult);

    //     // Bitwise NOT
    //     int notResult = ~a; // Result: 1010 (in 32-bit representation, it's -6 in decimal)
    //     System.out.println("Bitwise NOT of ~" + a + " = " + notResult);

    //    System.out.println(4 >> 1); // Right shift
    //    System.out.println(4 << 1); // Left shift
    //    System.out.println(4 >>> 1); // Unsigned right shift
    //    System.out.println(-4 >> 1); // Right shift negative number
    //    System.out.println(-4 << 1); // Left shift negative number
    //    System.out.println(-4 >>> 1); // Unsigned right shift negative number

    //     System.out.println(Integer.MAX_VALUE); // Maximum value of an integer
    //     System.out.println(Integer.MIN_VALUE); // Minimum value of an integer
    //     System.out.println(Long.MAX_VALUE); // Maximum value of a long
    //     System.out.println(Long.MIN_VALUE); // Minimum value of a long

    //    int x = 12; // value for 'x'
    //     int y = 7;  // value for 'y'
    
    //     // Bitwise left shift for 'x'
    //      int leftShift = x << 1;

    //     // Bitwise right shift for 'y'
    //     int rightShift = y>>1;
        
    //     System.out.println(leftShift);
    //     System.out.println(rightShift);

        Scanner sc = new Scanner(System.in);

        // // Read coordinates
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Calculate area
        int area = (x2 - x1) * (y2 - y1);

        // Print result
        System.out.println(area);
      
        int x = sc.nextInt();
        System.out.println(x);

        sc.close();
    }

}
