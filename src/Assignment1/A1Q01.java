/*
Write a program to count number of bits of an integer number.
Note: Use bitwise operator.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q01 {
    public static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to count bits: ");
        int num =sc.nextInt();
        System.out.println("Number of bits in " + num + " : " + countBits(num));
    }
}
