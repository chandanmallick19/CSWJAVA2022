package Assignment1;
import java.util.Scanner;
public class A1Q2 {
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
