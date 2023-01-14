package Assignment1;
import java.util.Scanner;
public class A1Q15 {
        public static void rotate(int[] array, int k) {
            int n = array.length;
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                result[(i + k) % n] = array[i];
            }

            for (int i = 0; i < n; i++) {
                array[i] = result[i];
            }
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

            System.out.print("Enter the number of positions to rotate: ");
            int k = sc.nextInt();

            rotate(array, k);

            System.out.println("The rotated array is: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
