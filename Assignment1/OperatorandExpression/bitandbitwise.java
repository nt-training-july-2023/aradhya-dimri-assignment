package Assignment1;

public class bitandbitwise {
        public static void main(String[] args) {
                int num1 = 42;
                int num2 = 21;

                // Bitwise AND operation
                int result = num1 & num2;
                System.out.println("Bitwise AND Result: " + result);

                // OR operation
                int resultor = num1 | num2;
                System.out.println("Bitwise OR Result: " + resultor);

                // XOR operation
                int resultxor = num1 ^ num2;
                System.out.println("Bitwise XOR Result: " + resultxor);

                // NOT operation
                int resultnot = ~num1;
                System.out.println("Bitwise NOT of num1: " + resultnot);

                // Left bit shift operation
                int leftShiftNum1 = num1 << 1;
                System.out.println("Left Shift of num1: " + leftShiftNum1);

                // Right bit shift operation
                int rightShiftNum2 = num2 >> 1;
                System.out.println("Right Shift of num2: " + rightShiftNum2);
        }
}