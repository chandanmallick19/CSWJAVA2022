/*
Write a program which read a number and base1 and base2 and convert the number of base1 to base2.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            String number = sc.next();
            System.out.println("Enter base 1: ");
            int base1 = sc.nextInt();
            System.out.println("Enter base 2: ");
            int base2 = sc.nextInt();

            String converted = convert(number, base1, base2);
            System.out.println("Converted: " + converted);
        }

        public static String convert(String number, int base1, int base2) {
            int decimal = Integer.parseInt(number, base1);
            String converted = Integer.toString(decimal, base2);
            return converted;
        }
    }

