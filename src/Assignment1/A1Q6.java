package Assignment1;
import java.util.Scanner;
public class A1Q6 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a String line: ");
            String str = sc.nextLine();
            String[] words = str.split("\\s+");
            int wordCount = words.length;
            System.out.println("Number of words in the string: " + wordCount);
        }
    }
