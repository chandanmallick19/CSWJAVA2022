/*
Write program to insert an element in an array at specified position.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q18 {
        public static void insert(int[] array, int element, int position) {
            int n = array.length;
            for (int i = n - 1; i > position - 1; i--) {
                array[i] = array[i - 1];
            }
            array[position - 1] = element;
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

            System.out.print("Enter the element to be inserted: ");
            int element = sc.nextInt();

            System.out.print("Enter the position where the element is to be inserted: ");
            int position = sc.nextInt();

            insert(array, element, position);

            System.out.println("The modified array is: ");
            for (int i = 0; i < size + 1; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
