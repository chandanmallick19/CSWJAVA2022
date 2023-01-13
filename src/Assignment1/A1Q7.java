package Assignment1;
import java.util.Scanner;
public class A1Q7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your date of birth (DD/MM/YYYY): ");
            String dob = scanner.nextLine();

            // Extract the first two letters of the name
            String nameInitials = name.substring(0, 2);

            // Extract the month from the date of birth
            String month = dob.substring(3, 5);

            // Concatenate the name initials and month to create the password
            String password = nameInitials + month;

            System.out.println("Your password is: " + password);
        }
    }

