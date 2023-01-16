/*
Write a program which reads two integer number of any length from user and find it sum.
Note: Don’t use big integer class.
 */

package Assignment1;
import java.util.Scanner;
public class A1Q8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first integer: ");
            String num1 = sc.next();
            System.out.println("Enter the second integer: ");
            String num2 = sc.next();

            String sum = add(num1, num2);
            System.out.println("Sum: " + sum);
        }

        public static String add(String num1, String num2) {
            int carry = 0;
            StringBuilder sum = new StringBuilder();

            int len1 = num1.length();
            int len2 = num2.length();

            for (int i = len1 - 1, j = len2 - 1; i >= 0 || j >= 0; i--, j--) {
                int x = i < 0 ? 0 : num1.charAt(i) - '0';
                int y = j < 0 ? 0 : num2.charAt(j) - '0';
                int s = x + y + carry;
                sum.append(s % 10);
                carry = s / 10;
            }

            if (carry != 0) {
                sum.append(carry);
            }

            return sum.reverse().toString();
        }
    }
