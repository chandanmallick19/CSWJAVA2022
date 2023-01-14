package Assignment1;
import java.util.Scanner;

class Num {
    private int[] arr;

    public Num() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] reverse() {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        Num num = new Num();
        int[] reversed = num.reverse();
        System.out.print("The original array is: ");
        for (int i : num.getArr()) {
            System.out.print(i + " ");
        }
        System.out.print("\nThe reversed array is: ");
        for (int i : reversed) {
            System.out.print(i + " ");
        }
    }
}
