/*
T parity of a binary word is 1 if the number of 1s in the word is odd; otherwise, it is 0.
Write a program to compute the parity of a very large number of 64-bits.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q02 {
    public static short parity(long x) {
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short)(x & 0x1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a long number: ");
        long num = sc.nextInt();
        System.out.println("Parity of " + num + " : " + parity(num));
    }
}
