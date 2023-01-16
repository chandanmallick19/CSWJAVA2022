/*
Write a program to count how many prime numbers present in an array.ll
 */

package Assignment1;
import java.util.Scanner;
public class A1Q14 {
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            int primeCounter = 0;
            for (int i = 0; i < size; i++) {
                if (isPrime(array[i])) {
                    primeCounter++;
                }
            }
            System.out.println("The number of prime numbers in the array is: " + primeCounter);
        }
    }
