/*
Write a program to count the frequency of each number present in an array.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q13 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            int[] frequency = new int[100]; // assuming the numbers in the array will be less than 100
            for (int i = 0; i < size; i++) {
                frequency[array[i]]++;
            }

            for (int i = 0; i < 100; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Frequency of " + i + ": " + frequency[i]);
                }
            }
        }
    }
