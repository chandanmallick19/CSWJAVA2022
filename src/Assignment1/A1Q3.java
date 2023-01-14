/*
Write a program to swap the ith bit with jth bit of a 64-bits integer number.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q3 {
        public static long swapBits(long n, int i, int j) {
            // check if the bits at the i and j positions are different
            if (((n >> i) & 1) != ((n >> j) & 1)) {
                // use bitwise XOR to swap the ith and jth bits
                n ^= (1L << i) | (1L << j);
            }
            return n;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter an Integer: ");
            long n = 2874;
            System.out.println("Enter the i-th bit: ");
            int i = 1;
            System.out.println("Enter the j-th bit: ");
            int j = 12;
            System.out.println(swapBits(n, i, j));
        }
    }

