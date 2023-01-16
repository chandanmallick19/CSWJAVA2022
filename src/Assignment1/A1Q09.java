/*
Write a program which encode the spreadsheet column.
Example:
A is encoded to 1
B is encoded to 2
…..
Z is encoded to 26
ZA is encoded to 27
 */

package Assignment1;
import java.util.Scanner;
public class A1Q09 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a spreadsheet column: ");
            String column =sc.nextLine();
            int encoded = encode(column);
            System.out.println("Encoded value: " + encoded);
        }

        public static int encode(String column) {
            int result = 0;
            for (int i = 0; i < column.length(); i++) {
                result = result * 26 + (column.charAt(i) - 'A' + 1);
            }
            return result;
        }
    }
