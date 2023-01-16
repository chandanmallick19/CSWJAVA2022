/*
Write a program to merge two sorted array to make a single sorted array.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q17 {
        public static int[] merge(int[] a, int[] b) {
            int n = a.length;
            int m = b.length;
            int[] result = new int[n + m];
            int i = 0, j = 0, k = 0;

            while (i < n && j < m) {
                if (a[i] < b[j]) {
                    result[k++] = a[i++];
                } else {
                    result[k++] = b[j++];
                }
            }

            while (i < n) {
                result[k++] = a[i++];
            }

            while (j < m) {
                result[k++] = b[j++];
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the first array: ");
            int sizeA = sc.nextInt();
            int[] a = new int[sizeA];

            System.out.println("Enter the elements of the first array: ");
            for (int i = 0; i < sizeA; i++) {
                a[i] = sc.nextInt();
            }

            System.out.print("Enter the size of the second array: ");
            int sizeB = sc.nextInt();
            int[] b = new int[sizeB];

            System.out.println("Enter the elements of the second array: ");
            for (int i = 0; i < sizeB; i++) {
                b[i] = sc.nextInt();
            }

            int[] result = merge(a, b);

            System.out.println("The merged and sorted array is: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

