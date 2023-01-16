/*
Write a program to find the reverse of a string.
Note: Use StringBuffer class
 */

package Assignment1;
import java.util.Scanner;
public class A1Q5 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String input =sc.nextLine();
            StringBuffer output = new StringBuffer(input);
            output.reverse();
            System.out.println(output);
        }
    }