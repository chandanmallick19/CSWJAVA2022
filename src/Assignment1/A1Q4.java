package Assignment1;

public class A1Q4 {
        public static int multiply(int x, int y) {
            int result = 0;
            while (y != 0) {
                if ((y & 1) != 0) {
                    result = add(result, x);
                }
                x = x << 1;
                y = y >> 1;
            }
            return result;
        }
        public static int add(int a, int b) {
            while (b != 0) {
                int carry = a & b;
                a = a ^ b;
                b = carry << 1;
            }
            return a;
        }
        public static void main(String[] args) {
            int x = 5, y = 8;
            int result = multiply(x, y);
            System.out.println("Result of " + x + " * " + y + " = " + result);
        }
    }
