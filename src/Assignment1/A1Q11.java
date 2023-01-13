package Assignment1;
import java.util.Scanner;
public class A1Q11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();
            String[] words = sentence.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
        }
    }

