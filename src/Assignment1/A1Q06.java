/*
Write a program to count number of word present in a string.
Note: Use split function
 */

package Assignment1;
import java.util.Scanner;
public class A1Q06 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a String line: ");
            String str = sc.nextLine();
            String[] words = str.split("\\s+");
            int wordCount = words.length;
            System.out.println("Number of words in the string: " + wordCount);
        }
    }
