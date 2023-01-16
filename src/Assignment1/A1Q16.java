/*
Write a program to delete all duplicate present in a sorted array.
 */

package Assignment1;
import java.util.Scanner;

public class A1Q16 {
        public static int removeDuplicates(int[] array) {
            int n = array.length;
            if (n == 0 || n == 1) {
                return n;
            }

            int j = 0;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] != array[i + 1]) {
                    array[j++] = array[i];
                }
            }

            array[j++] = array[n - 1];

            return j;
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

            int newSize = removeDuplicates(array);

            System.out.println("The array after removing duplicates is: ");
            for (int i = 0; i < newSize; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
