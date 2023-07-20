public class operators {
    public static void main(String args[]) {
        int num1 = 7;
        int num2 = 5;
        int num3 = 5;
        int num4 = 9;

        // ------------------ Standard operators - most, if not all the operators are
        // the same as
        // JavaScript

        // int resultAdd = num1 + num2;
        // System.out.println(resultAdd);

        // int resultSubtract = num1 - num2;
        // System.out.println(resultSubtract);

        // int resultMultiply = num1 * num2;
        // System.out.println(resultMultiply);

        // int resultDivide = num1 % num2; // when using the / operator for division, it
        // is best to use % Modulo as / only
        // // outputs whole numbers whereas % outputs the remainders
        // System.out.println(resultDivide);

        // num1 = num1 + 2; // this increases the value and assigns the new value to the
        // variable.
        // System.out.println(num1);

        // num1 += 2;
        // System.out.println(num1);

        // num1++;
        // System.out.println(num1);

        // num1--; // post increment or --num1 is post increment
        // System.out.println(num1);

        // int result = ++num2; // This will first increment THEN add it to the value of
        // num2,
        // System.out.println(result);

        // int result1 = num2++; // This will first fetch the value of num2, THEN it
        // will increment it
        // System.out.println(result1);

        // boolean result = num1 < num2;
        // boolean result = num1 > num2;

        // System.out.println(result);

        // ------------------ Logical Operators

        boolean result = num1 > num2 && num3 > num4;
        System.out.println(result);

    }
}
