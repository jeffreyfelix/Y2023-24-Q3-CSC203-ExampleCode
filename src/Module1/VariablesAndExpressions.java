package Module1;

public class VariablesAndExpressions {

    public static void main(String[] args) {
        // Primitive Types
        boolean w = true;
        int x = 3;
        double y = 4.0;
        char z = 'A';

        // Type Casting
        int casted = (int) (10.0 / 3.0); // 3

        // Expressions
        int a = 1 + 2 - 3; // 0
        int b = 4 * 5 / 6; // 3
        double c = (float) ((7 + 8) % 9); // 6.0

        // Logical Operators
        boolean b1 = !true; // false
        boolean b2 = true && false; // false
        boolean b3 = true || false; // true

        // Short-Circuit Evaluation
        boolean good = true || 1 / 0 == 0; // true
    }

}
