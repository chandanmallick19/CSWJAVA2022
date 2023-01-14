package Assignment1;
import java.util.Scanner;
public class A1Q12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            String number = sc.nextLine();
            int[] frequency = new int[10];

            for (int i = 0; i < number.length(); i++) {
                char digit = number.charAt(i);
                if (Character.isDigit(digit)) {
                    int digitValue = Character.getNumericValue(digit);
                    frequency[digitValue]++;
                }
            }

            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Frequency of " + i + ": " + frequency[i]);
                }
            }
        }
    }
